package com.example.f1.service;

import com.example.f1.entity.User;
import java.util.List;

public interface UserService {
    List<User> list();
    int add(User user);
    int update(User user);
    int delete(Long id);
}