package com.example.f1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.f1.mapper")
public class F1Application {
    public static void main(String[] args) {
        SpringApplication.run(F1Application.class, args);
    }
}