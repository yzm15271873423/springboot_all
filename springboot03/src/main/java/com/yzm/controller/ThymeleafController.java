package com.yzm.controller;

import com.yzm.pojo.Emp;
import com.yzm.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Auther: yzm
 * @Date: 2021/5/24 - 05 - 24 - 21:26
 * @Description: com.yzm.controller
 * @version: 1.0
 */
@Controller
public class ThymeleafController {
    @Autowired
    private EmpService empService;

    @RequestMapping("index")
    public String showIndex(Map<String,Object> map){
        map.put("msg","testMessage");
        return "index";
    }

    @RequestMapping("showEmp")
    public String showEmp(Map<String,Object> map){
        List<Emp> list = empService.findAll();
        map.put("emplist",list);
        map.put("emp", list.get(0));
        return "showEmp";
    }
}
