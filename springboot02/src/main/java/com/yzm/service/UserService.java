package com.yzm.service;

import com.yzm.pojo.User;

import java.util.List;

/**
 * @Auther: yzm
 * @Date: 2021/5/23 - 05 - 23 - 22:11
 * @Description: com.yzm.service
 * @version: 1.0
 */
public interface UserService {
    List<User> findAll();
}
