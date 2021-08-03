package com.huadi.java.springboot.service;

import com.huadi.java.springboot.po.Team;

import java.util.List;

public interface TeamService {
    List<Team> findall();

    void save(Team team);

    void delete(int id);
}
