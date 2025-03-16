package com.example.spm.service;

import com.example.spm.pojo.Product;

import java.util.List;

public interface productService {
    Product getProductStockById(Integer productId);

    List<Product> getProducts(String keyword, int i, int limit);

    long getTotalCount(String keyword);

    Product getProductById(Integer id);
}
