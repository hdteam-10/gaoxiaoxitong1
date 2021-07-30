package com.huadi.java.springboot.dao;

import com.huadi.java.springboot.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
//    List<User> queryUserList();

    User login(@Param("username") String username,@Param("password") String password);
}
