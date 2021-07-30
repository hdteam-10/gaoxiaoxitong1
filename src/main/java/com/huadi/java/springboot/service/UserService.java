package com.huadi.java.springboot.service;

import com.huadi.java.springboot.po.User;
import org.springframework.web.bind.annotation.PostMapping;

public interface UserService {
    User login(String username, String password);
}
