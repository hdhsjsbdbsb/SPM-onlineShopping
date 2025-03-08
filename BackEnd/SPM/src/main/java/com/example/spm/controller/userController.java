package com.example.spm.controller;

import com.example.spm.pojo.Result;
import com.example.spm.pojo.User;
import com.example.spm.service.userService;
import com.example.spm.utils.JwtUtil;
import com.example.spm.utils.Md5Util;
import jakarta.validation.constraints.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/auth")
@Validated
public class userController {

    @Autowired
    private userService userservice;

    /*
     * 注册账号，要求四个参数：用户名、密码、手机号和邮箱
     * */
    @PostMapping("/register")
    public Result register(@Pattern(regexp = "^\\S{1,10}$") String username, @Pattern(regexp = "^\\S{6,16}$") String password
    ,@Pattern(regexp = "^(?:\\+?86)?1[3-9]\\d{9}$") String phone, String email) {
        //检验数据库中是否存在相同的用户
        User u = userservice.findByUsername(username);
        if(u != null) {
            return Result.error("该用户名已存在！");
        }

        //添加用户
        userservice.register(username, password, phone, email);
        return Result.success();
    }

    @PostMapping("/login")
    public Result login(String username, String password) {
        //判断用户是否存在
        User u = userservice.findByUsername(username);
        if(u == null) {
            return Result.error("该用户不存在！");
        }

        //判断密码是否正确
        if(!u.getPassword().equals(Md5Util.getMD5String(password))) {
            return Result.error("密码错误！");
        }

        //密码正确后生成jwt密钥
        Map<String, Object> claims = new HashMap<>();
        claims.put("id", u.getId());
        claims.put("username", u.getName());
        String token = JwtUtil.genToken(claims);
        return Result.success(token);//将token发送前端作为数据data部分
    }
}
