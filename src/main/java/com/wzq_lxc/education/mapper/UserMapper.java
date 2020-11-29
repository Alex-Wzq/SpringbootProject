package com.wzq_lxc.education.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wzq_lxc.education.entity.User;
import org.springframework.stereotype.Repository;

@Repository
// BaseMapper接口自动实现CRUD
// mp自动生成主键 19位
public interface UserMapper extends BaseMapper<User> {

}
