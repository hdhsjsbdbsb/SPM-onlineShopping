package com.example.spm.mapper;

import com.example.spm.pojo.Address;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface addressMapper {

    @Insert("INSERT INTO address(user_id, recipient, phone, province, city, district, address, is_default, created_at) " +
            "VALUES (#{userId}, #{recipient}, #{phone}, #{province}, #{city}, #{district}, #{address}, #{isDefault}, NOW())")
    void add(
            @Param("userId") Integer userId,
            @Param("recipient") String recipient,
            @Param("phone") String phone,
            @Param("province") String province,
            @Param("city") String city,
            @Param("district") String district,
            @Param("address") String address,
            @Param("isDefault") int isDefault
    );


    @Select("select * from address where id =#{id}")
    List<Address> findById(Integer id);
}