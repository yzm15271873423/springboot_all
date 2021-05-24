package com.yzm.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yzm.mapper.EmpMapper;
import com.yzm.pojo.Emp;
import com.yzm.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: yzm
 * @Date: 2021/5/23 - 05 - 23 - 22:11
 * @Description: com.yzm.service.impl
 * @version: 1.0
 */
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public List<Emp> findAll() {
        return empMapper.findAll();
    }
}
