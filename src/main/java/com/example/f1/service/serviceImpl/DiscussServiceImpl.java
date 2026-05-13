package com.example.f1.service.serviceImpl;

import com.example.f1.entity.Discuss;
import com.example.f1.mapper.DiscussMapper;
import com.example.f1.service.DiscussService;
import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;
import java.util.List;

@Service
public class DiscussServiceImpl implements DiscussService {

    @Resource
    private DiscussMapper discussMapper;

    @Override
    public List<Discuss> list() {
        return discussMapper.list();
    }

    @Override
    public Discuss getById(Long id) {
        return discussMapper.getById(id);
    }

    @Override
    public int add(Discuss discuss) {
        return discussMapper.add(discuss);
    }

    @Override
    public int update(Discuss discuss) {
        return discussMapper.update(discuss);
    }

    @Override
    public int delete(Long id) {
        return discussMapper.delete(id);
    }
}