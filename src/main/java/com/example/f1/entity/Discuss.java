package com.example.f1.entity;

import lombok.Data;
import java.time.LocalDate;

@Data
public class Discuss {
    private Long id;
    private String title;
    private String description;
    private String coverImage;
    private String author;
    private LocalDate publishTime;
    private Integer viewCount;
    private Integer status;
}