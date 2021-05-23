package com.yzm.controller;

import com.yzm.pojo.User;
import com.yzm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Auther: yzm
 * @Date: 2021/5/23 - 05 - 23 - 22:12
 * @Description: com.yzm.controller
 * @version: 1.0
 */

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("findAll")
    private List<User> findAll(){

        return userService.findAll();
    }
}
