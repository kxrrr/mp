package com.kxr;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kxr.domain.User;
import com.kxr.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;

@SpringBootTest
public class QueryTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    void eq(){
        //1.创建条件查询对象
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        //2.设置查询条件，指定查询字段和匹配的值
        queryWrapper.eq("name", "Jack");
        //3.进行条件查询
        User user = userMapper.selectOne(queryWrapper);
        System.out.println(user);
    }

    @Test
    void eq2(){
        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(User::getName,"Jack");
        User user = userMapper.selectOne(lambdaQueryWrapper);
        System.out.println(user);
    }

    @Test
    void isEmpty(){
        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(User::getName,null);
        User user = userMapper.selectOne(lambdaQueryWrapper);
        System.out.println(user);
    }

    @Test
    void isEmpty2(){
        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        String name = null; //false
        lambdaQueryWrapper.eq(name != null ,User::getName,name);
        List<User> user = userMapper.selectList(lambdaQueryWrapper);
        System.out.println(user);
    }

    @Test
    void allEq1(){
        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(User::getName,"Tom");
        lambdaQueryWrapper.eq(User::getAge,28);
        User user = userMapper.selectOne(lambdaQueryWrapper);
        System.out.println(user);
    }

    @Test
    void allEq2(){
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("name","Tom");
        hashMap.put("age",null);

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.allEq(hashMap,true);

        User user = userMapper.selectOne(queryWrapper);
        System.out.println(user);
    }

    @Test
    void ne(){
        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.ne(User::getName,"Tom");
        List<User> users = userMapper.selectList(lambdaQueryWrapper);
        System.out.println(users);
    }
}
