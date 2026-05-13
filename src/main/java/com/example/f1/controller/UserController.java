package com.example.f1.controller;

import com.example.f1.common.Result;
import com.example.f1.entity.User;
import com.example.f1.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/list")
    public Result<List<User>> list() {
        return Result.success(userService.list());
    }

    @PostMapping("/add")
    public Result<Integer> add(@RequestBody User user) {
        return Result.success(userService.add(user));
    }

    @PutMapping("/update")
    public Result<Integer> update(@RequestBody User user) {
        return Result.success(userService.update(user));
    }

    @DeleteMapping("/delete/{id}")
    public Result<Integer> delete(@PathVariable Long id) {
        return Result.success(userService.delete(id));
    }
}