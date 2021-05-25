package com.yzm;

import com.yzm.mapper.User;
import com.yzm.pojo.Emp;
import com.yzm.service.EmpService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot03ApplicationTests {

    @Autowired
    private EmpService empService;

    @Autowired
    @Qualifier("user2")
    private User user;

    @Test
    void testFindEmpAll() {

        List<Emp> list = empService.findAll();
        list.forEach(System.out::println);

        System.out.println(user);
    }

}
