package com.example.f1.controller;

import com.example.f1.common.Result;
import com.example.f1.entity.Driver;
import com.example.f1.service.DriverService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/driver")
public class DriverController {
    @Resource
    private DriverService driverService;

    @GetMapping("/list")
    public Result<List<Driver>> list() {
        return Result.success(driverService.list());
    }

    @GetMapping("/detail")
    public Result<Driver> detail(@RequestParam String name) {
        return Result.success(driverService.getByName(name));
    }

    @PostMapping("/add")
    public Result<Integer> add(@RequestBody Driver driver) {
        return Result.success(driverService.add(driver));
    }

    @PutMapping("/update")
    public Result<Integer> update(@RequestBody Driver driver) {
        return Result.success(driverService.update(driver));
    }

    @DeleteMapping("/delete/{id}")
    public Result<Integer> delete(@PathVariable Long id) {
        return Result.success(driverService.delete(id));
    }
}