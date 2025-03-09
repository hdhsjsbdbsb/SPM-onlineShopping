package com.example.spm.mapper;

import com.example.spm.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface userMapper {

    @Insert("insert into user(username, password, phone, email,  created_at, updated_at)" +
            "values(#{username}, #{password},#{phone}, #{email}, now(), now())")
    public void add(@Param("username") String username, @Param("password") String password, @Param("phone") String phone, String email);

    @Select("select * from user where username=#{username}")
    public User findByUsername(String username);
}
