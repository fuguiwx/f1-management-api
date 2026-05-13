package com.example.f1.controller;

import com.example.f1.common.Result;
import com.example.f1.entity.Discuss;
import com.example.f1.service.DiscussService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/discuss")
public class DiscussController {
    @Resource
    private DiscussService discussService;

    @GetMapping("/list")
    public Result<List<Discuss>> list() {
        return Result.success(discussService.list());
    }

    @GetMapping("/detail/{id}")
    public Result<Discuss> detail(@PathVariable Long id) {
        return Result.success(discussService.getById(id));
    }

    @PostMapping("/add")
    public Result<Integer> add(@RequestBody Discuss d) {
        return Result.success(discussService.add(d));
    }

    @PutMapping("/update")
    public Result<Integer> update(@RequestBody Discuss d) {
        return Result.success(discussService.update(d));
    }

    @DeleteMapping("/delete/{id}")
    public Result<Integer> delete(@PathVariable Long id) {
        return Result.success(discussService.delete(id));
    }
}