package com.huadi.java.springboot.service;

import com.huadi.java.springboot.dao.TeamMapper;
import com.huadi.java.springboot.po.Team;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional

public class TeamServiceImpl implements TeamService {
    @Autowired
    private TeamMapper teamMapper;

    @Override
    public List<Team> findall() {
        return teamMapper.findall();
    }

    @Override
    public void save(Team team) {
        teamMapper.save(team);

    }

    @Override
    public void delete(int id) {
        teamMapper.delete(id);
    }
}