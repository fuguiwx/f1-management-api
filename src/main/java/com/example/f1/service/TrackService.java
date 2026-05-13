package com.example.f1.service;

import com.example.f1.entity.Track;
import java.util.List;

public interface TrackService {
    List<Track> list();
    Track getByName(String name);
    int add(Track track);
    int update(Track track);
    int delete(Long id);
}