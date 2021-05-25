package com.yzm.config;

import com.yzm.intercepter.DemoIntercepter;
import com.yzm.mapper.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.jws.soap.SOAPBinding;

/**
 * @Auther: yzm
 * @Date: 2021/5/25 - 05 - 25 - 19:34
 * @Description: com.yzm.config
 * @version: 1.0
 */
@Configuration
public class MyConfig {

    @Bean("user1")
    public User getUser(){
        User user = new User();
        user.setUid(1);
        user.setUname("旋涡刘能");
        return user;
    }

    @Bean("user2")
    public User getUser2(){
        User user = new User();
        user.setUid(2);
        user.setUname("宇智波日天");
        return user;
    }

}
