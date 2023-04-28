package com.kxr.mp01.controller;

import com.kxr.mp01.domain.User;
import com.kxr.mp01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/selectAll")
    public List<User> selectAll(){
        return userService.selectAll();
    }
}
