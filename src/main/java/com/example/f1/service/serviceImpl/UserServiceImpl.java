package com.example.f1.service.impl;

import com.example.f1.entity.User;
import com.example.f1.mapper.UserMapper;
import com.example.f1.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> list() { return userMapper.list(); }
    @Override
    public int add(User user) { return userMapper.add(user); }
    @Override
    public int update(User user) { return userMapper.update(user); }
    @Override
    public int delete(Long id) { return userMapper.delete(id); }
}