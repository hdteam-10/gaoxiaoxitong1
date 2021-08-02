package com.huadi.java.springboot.controller;

import com.huadi.java.springboot.dao.UserMapper;
import com.huadi.java.springboot.po.User;
import com.huadi.java.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class UserController {
//    @Autowired
//    private UserMapper userMapper;
//    @GetMapping("/queryUserList")
//    public List<User> queryUserList(){
//        List<User> userlist = userMapper.queryUserList();
//        for(User user : userlist){
//            System.out.println(user);
//        }
//        return userlist;
//    }
    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String login(String username,String password){
        User login = userService.login(username,password);
        if(login != null){
            return "findall";
        }
        else return "index";
    }



}
