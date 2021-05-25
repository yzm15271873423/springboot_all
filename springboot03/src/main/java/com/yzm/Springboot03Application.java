package com.yzm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Springboot03Application extends SpringBootServletInitializer {
    //重写配置方法
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Springboot03Application.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(Springboot03Application.class, args);
    }

}
