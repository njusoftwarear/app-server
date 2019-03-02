package com.example.server.controller;

import com.example.server.mapper.UserMapper;
import com.example.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public String get() {
        return userService.get();
    }
}
