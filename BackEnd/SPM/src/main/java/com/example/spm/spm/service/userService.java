package com.example.spm.service;

import com.example.spm.pojo.User;

public interface userService {
    User findByUsername(String username);

    void register(User user);
}
