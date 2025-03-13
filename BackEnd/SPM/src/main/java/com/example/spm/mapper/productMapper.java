package com.example.spm.mapper;

import com.example.spm.pojo.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface productMapper {
    @Select("SELECT * FROM product WHERE id = #{id}")
    Product getProductById(Integer id);

    @Select("SELECT * FROM product WHERE name LIKE CONCAT('%', #{keyword}, '%') LIMIT #{page}, #{limit}")
    List<Product> getProducts(String keyword, int page, int limit);
    @Select("SELECT COUNT(*) FROM product WHERE name LIKE CONCAT('%', #{keyword}, '%')")
    long getTotalCount(String keyword);
}
