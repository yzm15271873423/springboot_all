package com.yzm.mapper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: yzm
 * @Date: 2021/5/23 - 05 - 23 - 22:10
 * @Description: com.yzm.pojo
 * @version: 1.0
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private Integer uid;
    private String uname;
    private String password;

}
