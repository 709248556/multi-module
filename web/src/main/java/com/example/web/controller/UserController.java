package com.example.web.controller;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.IUserService;
import serviceImpl.UserServiceImpl;

@RestController
@RequestMapping("/web")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @GetMapping("/getUser")
    public User getUser(String username){
        System.out.println(username);
        return iUserService.getUser(username);
    }
}
