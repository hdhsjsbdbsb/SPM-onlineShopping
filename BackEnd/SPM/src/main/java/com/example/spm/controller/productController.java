package com.example.spm.controller;

import com.example.spm.service.productService;
import com.example.spm.pojo.Result;
import com.example.spm.pojo.Product;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/products")
public class productController {
    @Autowired
    private productService productservice;
    @GetMapping
    public Result getProducts(
            @RequestParam(required = false) String keyword,
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int limit) {

        List<Product> products = productservice.getProducts(keyword, page-1, limit);
        long total = productservice.getTotalCount(keyword);

        Map<String, Object> data = Map.of(
                "page", page,
                "limit", limit,
                "total", total,
                "products", products
        );

        return Result.success(data);
    }
    //    @PostMapping
//    public int addProduct(@RequestBody Product product) {
//        return productService.addProduct(product);
//    }
//
    @GetMapping("search/{id}")
    public Result getProductById(@PathVariable Integer id) {
        System.out.println(productservice.getProductById(id));
        return Result.success(productservice.getProductById(id));
    }
}
