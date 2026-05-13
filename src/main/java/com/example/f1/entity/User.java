package com.example.f1.entity;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class User {
    private Long id;
    private String openid;
    private String nickname;
    private String avatar;
    private LocalDateTime createTime;
    private Integer status;
}