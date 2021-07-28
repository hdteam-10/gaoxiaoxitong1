package com.huadi.java.springboot.controller;

import com.huadi.java.springboot.dao.UserMapper;
import com.huadi.java.springboot.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @GetMapping("/queryUserList")
    public List<User> queryUserList(){
        List<User> userlist = userMapper.queryUserList();
        for(User user : userlist){
            System.out.println(user);
        }
        return userlist;
    }
}
