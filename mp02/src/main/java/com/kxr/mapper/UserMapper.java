package com.kxr.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kxr.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    List<User> selectByName(String name);
}
