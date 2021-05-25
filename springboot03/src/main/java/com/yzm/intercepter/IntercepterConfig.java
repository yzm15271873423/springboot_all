package com.yzm.intercepter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Auther: yzm
 * @Date: 2021/5/25 - 05 - 25 - 20:01
 * @Description: com.yzm.intercepter
 * @version: 1.0
 */
@Configuration
public class IntercepterConfig implements WebMvcConfigurer {

    @Autowired
    private DemoIntercepter demoIntercepter;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(demoIntercepter).addPathPatterns("/**").excludePathPatterns("/index");
    }
}
