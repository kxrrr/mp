package com.kxr.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kxr.domain.User;

import java.util.List;

public interface UserService extends IService<User> {
    List<User> selectList();
    List<User> selectByName();
}
