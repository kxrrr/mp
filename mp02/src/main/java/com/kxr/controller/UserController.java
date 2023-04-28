package com.kxr.controller;

import com.kxr.domain.User;
import com.kxr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/selectList")
    public List<User> selectList(){
        return userService.selectList();
    }

    @RequestMapping("/selectByName")
    public List<User> selectByName(){
        return userService.selectByName();
    }
}
