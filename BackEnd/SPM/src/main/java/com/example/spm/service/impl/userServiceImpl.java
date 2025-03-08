package com.example.spm.service.impl;

import com.example.spm.mapper.userMapper;
import com.example.spm.pojo.User;
import com.example.spm.service.userService;
import com.example.spm.utils.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements userService {

    @Autowired
    private userMapper usermapper;

    @Override
    public void register(String username, String password, String phone, String email) {
        String md5String = Md5Util.getMD5String(password);
        usermapper.add(username, md5String, phone, email);
    }

    @Override
    public User findByUsername(String username){
        User u = usermapper.findByUsername(username);
        return u;
    }
}
