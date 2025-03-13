package com.example.spm.service.impl;

import com.example.spm.mapper.productMapper;
import com.example.spm.pojo.Product;
import com.example.spm.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class productServiceImpl implements productService {
    @Autowired
    private productMapper productmapper;

    @Override
    public Product getProductById(Integer id) {
        return productmapper.getProductById(id);
    }

    @Override
    public List<Product> getProducts(String keyword, int page, int limit) {
        return  productmapper.getProducts(keyword, page, limit);
    }

    @Override
    public long getTotalCount(String keyword) {
        return productmapper.getTotalCount(keyword);
    }
}
