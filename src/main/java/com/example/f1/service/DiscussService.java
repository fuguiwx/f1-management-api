package com.example.f1.service;

import com.example.f1.entity.Discuss;
import java.util.List;

public interface DiscussService {
    List<Discuss> list();

    Discuss getById(Long id);

    int add(Discuss discuss);

    int update(Discuss discuss);

    int delete(Long id);
}