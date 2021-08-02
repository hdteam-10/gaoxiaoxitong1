package com.huadi.java.springboot.dao;

import com.huadi.java.springboot.po.Team;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TeamMapper {
    List<Team> findall();
}
