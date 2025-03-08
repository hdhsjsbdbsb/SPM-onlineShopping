package com.example.spm.service;

import com.example.spm.pojo.User;

public interface userService {
    User findByUsername(String username);

    void register(String username, String password, String phone, String email);
}
