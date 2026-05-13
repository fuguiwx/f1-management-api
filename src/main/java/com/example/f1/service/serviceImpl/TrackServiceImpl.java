package com.example.f1.service.serviceImpl;

import com.example.f1.entity.Track;
import com.example.f1.mapper.TrackMapper;
import com.example.f1.service.TrackService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TrackServiceImpl implements TrackService {

    // 🔥 必加：注入Mapper（500错误根源）
    @Resource
    private TrackMapper trackMapper;

    @Override
    public List<Track> list() {
        return trackMapper.list();
    }

    @Override
    public Track getByName(String name) {
        return trackMapper.getByName(name);
    }

    @Override
    public int add(Track track) {
        return trackMapper.add(track);
    }

    @Override
    public int update(Track track) {
        return trackMapper.update(track);
    }

    @Override
    public int delete(Long id) {
        return trackMapper.delete(id);
    }
}