package com.example.server.service;

import com.example.server.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserService {
    @Autowired
    private UserMapper userMapper;

    public String get(){
        return userMapper.selectByPrimaryKey("AR").getUserid();
    }
}
