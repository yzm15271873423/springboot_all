package com.yzm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: yzm
 * @Date: 2021/5/23 - 05 - 23 - 16:06
 * @Description: com.yzm.controller
 * @version: 1.0
 */
@Controller
public class MyController {

    @RequestMapping("secondController")
    @ResponseBody
    public String secondController(){

        return "hello springboot2";
    }

}
