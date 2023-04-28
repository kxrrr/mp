package com.kxr.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kxr.domain.User;
import com.kxr.mapper.UserMapper;
import com.kxr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> selectList() {
        return userMapper.selectList(null);
    }

    @Override
    public List<User> selectByName() {
        return userMapper.selectByName("Tom");
    }
}
