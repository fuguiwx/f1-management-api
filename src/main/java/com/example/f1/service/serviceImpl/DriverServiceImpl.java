package com.example.f1.service.serviceImpl;

import com.example.f1.entity.Driver;
import com.example.f1.mapper.DriverMapper;
import com.example.f1.service.DriverService;
import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;
import java.util.List;

@Service
public class DriverServiceImpl implements DriverService {

    @Resource
    private DriverMapper driverMapper;

    @Override
    public List<Driver> list() {
        return driverMapper.list();
    }

    @Override
    public Driver getByName(String name) {
        return driverMapper.getByName(name);
    }

    @Override
    public int add(Driver driver) {
        return driverMapper.add(driver);
    }

    @Override
    public int update(Driver driver) {
        return driverMapper.update(driver);
    }

    @Override
    public int delete(Long id) {
        return driverMapper.delete(id);
    }
}