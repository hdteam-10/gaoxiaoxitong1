package com.huadi.java.springboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/Add")
    public String toAdd(){return "/Add";}

//    @GetMapping("/teamList")
//    public String toteamList(){return "/teamList";}
//
//    @GetMapping("/second")
//    public String toSecond(){return "/second";}
}
