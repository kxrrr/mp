package com.kxr.mp01.service.impl;

import com.kxr.mp01.domain.User;
import com.kxr.mp01.mapper.UserMapper;
import com.kxr.mp01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }
}
