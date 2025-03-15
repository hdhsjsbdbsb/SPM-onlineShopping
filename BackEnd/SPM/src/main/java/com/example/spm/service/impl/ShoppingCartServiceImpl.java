package com.example.spm.service.impl;

import com.example.spm.mapper.ShoppingCartItemMapper;
import com.example.spm.pojo.ShoppingCartItem;
import com.example.spm.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
    @Autowired
    private ShoppingCartItemMapper shoppingCartItemMapper;

    @Override
    public Integer getTotalQuantity(Integer userId) {
        return shoppingCartItemMapper.sumQuantityByUserId(Long.valueOf(userId));
    }

    @Override
    public int addProductToCart(ShoppingCartItem shoppingCartItem) {
        return shoppingCartItemMapper.insert(shoppingCartItem);
    }
}
