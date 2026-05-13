package com.example.f1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
@MapperScan("com.example.f1.mapper")
public class F1Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(F1Application.class, args);
        Environment env = ctx.getEnvironment();
        System.out.println("===== DB CONFIG =====");
        System.out.println("URL: " + env.getProperty("spring.datasource.url"));
        System.out.println("USER: " + env.getProperty("spring.datasource.username"));
        System.out.println("PASS: " + env.getProperty("spring.datasource.password"));
        System.out.println("====================");
    }
}