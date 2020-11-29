package com.wzq_lxc.education.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import java.util.*;

@Data
// 生成get，set，无参构造函数，可以从Structure里查询
/**
 *
 */
public class User {

//     @TableId(type = IdType.INPUT) // 需要自己输入
//     @TableId(type = IdType.NONE)  // 需要自己输入
//     @TableId(type = IdType.UUID)
//     @TableId(type = IdType.ID_WORKER) // mp自带，生成19位，数字类型使用这种策略
//     @TableId(type = IdType.ID_WORKER_STR) // mp自带，生成19位，字符串类型使用这种策略
//     @TableId(type = IdType.AUTO) // 自动增长，默认，雪花算法
    private Long id;

    private String name;
    private Integer age;
    private String email;

    // 自动填充
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @Version
    @TableField(fill = FieldFill.INSERT)
    private Integer version;
}
