package com.example.f1.controller;

import com.example.f1.common.Result;
import com.example.f1.entity.Track;
import com.example.f1.service.TrackService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/track")
public class TrackController {
    @Resource
    private TrackService trackService;

    @GetMapping("/list")
    public Result<List<Track>> list() {
        return Result.success(trackService.list());
    }

    @GetMapping("/detail")
    public Result<Track> detail(@RequestParam String name) {
        return Result.success(trackService.getByName(name));
    }

    @PostMapping("/add")
    public Result<Integer> add(@RequestBody Track track) {
        return Result.success(trackService.add(track));
    }

    @PutMapping("/update")
    public Result<Integer> update(@RequestBody Track track) {
        return Result.success(trackService.update(track));
    }

    @DeleteMapping("/delete/{id}")
    public Result<Integer> delete(@PathVariable Long id) {
        return Result.success(trackService.delete(id));
    }
}