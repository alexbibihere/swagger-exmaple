package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ryan on 2019/5/19/0019
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @GetMapping
    public String getUser(){
        return "sd";
    }

    @PostMapping
    public String addUser(String username){
        return username;
    }
}
