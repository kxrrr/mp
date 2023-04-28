package com.kxr;

import com.kxr.domain.User;
import com.kxr.mapper.UserMapper;
import com.kxr.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Mp02ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    /************************************Mapper***************************************/
    @Test
    void selectList(){
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }

    @Test
    void insert(){
        User user = new User();
        user.setId(6L);
        user.setName("Nike");
        user.setAge(33);
        user.setEmail("123@163.com");

        userMapper.insert(user);
    }

    @Test
    void deleteOne(){
        userMapper.deleteById(6L);
    }

    @Test
    void updateById(){
        User user = new User();
        user.setId(6L);
        user.setName("Mike");
        user.setAge(35);
        user.setEmail("456@163.com");

        userMapper.updateById(user);
    }

    @Test
    void selectById(){
        userMapper.selectById(6L);
    }

    /************************************Service***************************************/
    @Test
    void insertService(){
        User user = new User();
        user.setId(7L);
        user.setName("张三");
        user.setAge(30);
        user.setEmail("123@163.com");

        userService.save(user);
    }

    @Test
    void deleteService(){
        userService.removeById(7L);
    }

    @Test
    void updateService(){
        User user = new User();
        user.setId(6L);
        user.setAge(40);

        userService.updateById(user);
    }

    @Test
    void selectService(){
        List<User> users = userService.selectList();
        System.out.println(users);
    }

    /************************************自定义Mapper***************************************/
    @Test
    void myMethod(){
        List<User> user = userMapper.selectByName("Tom");
        System.out.println(user);
    }
}
