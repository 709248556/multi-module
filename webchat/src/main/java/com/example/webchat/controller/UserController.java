package com.example.webchat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import entity.User;
import service.IUserService;

@RestController
@RequestMapping("/webchat")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @GetMapping("/getUser")
    public User getUser(String username){
        return iUserService.getUser(username);
    }
}
