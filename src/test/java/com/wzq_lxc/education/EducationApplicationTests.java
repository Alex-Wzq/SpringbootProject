package com.wzq_lxc.education;

import com.wzq_lxc.education.entity.User;
import com.wzq_lxc.education.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class EducationApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void findAll() {
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }

    @Test
    void addUser() {
        User user = new User();
        user.setName("alex");
        user.setAge(20);
        user.setEmail("alex@qq.com");

        userMapper.insert(user);
    }

    @Test
    void UpdateUser() {
        User user = new User();
        user.setId(2L);
        user.setAge(30);
        user.setName("Jack");

        int row = userMapper.updateById(user);
        System.out.println(row);
    }
}
