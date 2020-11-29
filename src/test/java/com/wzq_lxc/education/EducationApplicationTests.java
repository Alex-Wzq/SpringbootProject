package com.wzq_lxc.education;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wzq_lxc.education.entity.User;
import com.wzq_lxc.education.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.*;

@SpringBootTest
public class EducationApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
    }

}
