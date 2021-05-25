package com.yzm.controller;

import com.mysql.cj.Session;
import com.yzm.pojo.Emp;
import com.yzm.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
        //int i = 1/0;
        return "index";
    }

    @RequestMapping("showAllEmp")
    public String showEmp(Map<String,Object> map, HttpServletRequest req, HttpSession session){
        // 向request域放数据
        req.setAttribute("msg", "requestMessage");
        // 向session域放数据
        session.setAttribute("msg", "sessionMessage");
        // 向application域放数据
        req.getServletContext().setAttribute("msg", "applicationMessage");

        List<Emp> list = empService.findAll();
        map.put("emplist",list);
        return "showEmp";
    }

    @RequestMapping("/removeEmp")
    public String removeEmp(Integer empno,String ename){
        boolean success =empService.removeEmp(empno,ename);
        return "redirect:showAllEmp";
    }
}
