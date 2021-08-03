package com.huadi.java.springboot.controller;

import com.huadi.java.springboot.po.Team;
import com.huadi.java.springboot.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TeamController {
    @Autowired
    private TeamService teamService;

    @GetMapping("/teamList")
    public String findall(Model model){
        List<Team> teamList = teamService.findall();
        model.addAttribute("teamList",teamList);
        return "/teamList";
    }

    @PostMapping("/save")
    public String save(Team team){
        teamService.save(team);
        return "/addSuccess";

    }

    @GetMapping("delete")
    public String delete(int id){
        teamService.delete(id);

        return "/addSuccess";
    }


}
