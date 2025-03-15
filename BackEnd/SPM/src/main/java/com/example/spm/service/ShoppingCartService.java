package com.example.spm.service;

import com.example.spm.pojo.ShoppingCartItem;

public interface ShoppingCartService {
    Integer getTotalQuantity(Integer userId);

    int addProductToCart(ShoppingCartItem shoppingCartItem);
}
