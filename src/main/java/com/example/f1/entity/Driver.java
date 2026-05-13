package com.example.f1.entity;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class Driver {
    private Long id;
    private String name;
    private String team;
    private String avatar;
    private Integer number;
    private String country;
    private String description;
    private LocalDateTime createTime;
}