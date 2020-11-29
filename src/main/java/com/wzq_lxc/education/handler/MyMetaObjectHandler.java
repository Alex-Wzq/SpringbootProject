package com.wzq_lxc.education.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

// 用于自动填充
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("createTime", new Date(), metaObject); // 元数据
        this.setFieldValByName("updateTime", new Date(), metaObject); // 元数据
        this.setFieldValByName("version", 1, metaObject); // 元数据
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("updateTime", new Date(), metaObject); // 元数据
    }

}
