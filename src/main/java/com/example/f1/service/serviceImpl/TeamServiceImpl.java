package com.example.f1.service.serviceImpl;

import com.example.f1.entity.Team;
import com.example.f1.mapper.TeamMapper;
import com.example.f1.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamMapper teamMapper;

    @Override
    public List<Team> list() {
        return teamMapper.findAll();
    }

    @Override
    public Team detail(Integer id) {
        return teamMapper.findById(id);
    }

    @Override
    public int add(Team team) {
        return teamMapper.insert(team);
    }

    @Override
    public int update(Team team) {
        return teamMapper.update(team);
    }

    @Override
    public int delete(Integer id) {
        return teamMapper.delete(id);
    }
}