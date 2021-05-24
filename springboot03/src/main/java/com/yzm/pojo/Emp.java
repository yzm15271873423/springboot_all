package com.yzm.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Auther: yzm
 * @Date: 2021/5/23 - 05 - 23 - 22:10
 * @Description: com.yzm.pojo
 * @version: 1.0
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Emp {
    private Integer empno;
    private String ename;
    private String job;
    private Integer mgr;
    private Date hiredate;
    private Double sal;
    private Double comm;
    private Integer deptno;
}
