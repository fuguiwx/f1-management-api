package com.example.f1.service;

import com.example.f1.entity.Team;
import java.util.List;

public interface TeamService {
    List<Team> list();
    Team detail(Integer id);
    int add(Team team);
    int update(Team team);
    int delete(Integer id);
}