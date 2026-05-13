package com.example.f1.service;

import com.example.f1.entity.Driver;

import java.util.List;

public interface DriverService {
    List<Driver> list();
    Driver getByName(String name);
    int add(Driver driver);
    int update(Driver driver);
    int delete(Long id);
}