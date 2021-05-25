package com.yzm.mapper;

import com.yzm.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther: yzm
 * @Date: 2021/5/23 - 05 - 23 - 22:09
 * @Description: com.yzm.mapper
 * @version: 1.0
 */
@Mapper
public interface EmpMapper {

    List<Emp> findAll();

    int removeEmp(Integer empno, String ename);
}
