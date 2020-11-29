package com.wzq_lxc.education.entity;

import lombok.Data;

@Data
// 生成get，set，无参构造函数，可以从Structure里查询
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
