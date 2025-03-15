package com.example.spm.mapper;
import com.example.spm.pojo.ShoppingCartItem;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ShoppingCartItemMapper {
    @Select("SELECT * FROM cart WHERE user_id = #{userId}")
    Integer sumQuantityByUserId(Long userId);
    @Insert("INSERT INTO cart (user_id, product_id, quantity, spec, created_at) VALUES (#{userId}, #{productId}, #{quantity}, #{spec}, #{createdAt})")
    int insert(ShoppingCartItem shoppingCartItem);
}
