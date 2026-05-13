package com.example.f1.controller;

import com.example.f1.common.Result;
import com.example.f1.entity.Team;
import com.example.f1.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/team")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @GetMapping("/list")
    public Result<List<Team>> list() {
        return Result.success(teamService.list());
    }

    @GetMapping("/detail")
    public Result<Team> detail(@RequestParam Integer id) {
        return Result.success(teamService.detail(id));
    }

    @PostMapping("/add")
    public Result<Void> add(@RequestBody Team team) {
        teamService.add(team);
        return Result.success(null);
    }

    @PostMapping("/update")
    public Result<Void> update(@RequestBody Team team) {
        teamService.update(team);
        return Result.success(null);
    }

    @GetMapping("/delete")
    public Result<Void> delete(@RequestParam Integer id) {
        teamService.delete(id);
        return Result.success(null);
    }
}