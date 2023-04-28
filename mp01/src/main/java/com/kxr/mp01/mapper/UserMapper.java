package com.kxr.mp01.mapper;

import com.kxr.mp01.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<User> selectAll();
}
