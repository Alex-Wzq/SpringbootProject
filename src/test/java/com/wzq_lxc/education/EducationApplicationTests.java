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

    //多个id批量查询
    @Test
    public void testSelectById() {
        //根据id查询数据
        User user = userMapper.selectById(1231115382920916994L);
        //进行修改
        user.setAge(200);
        userMapper.updateById(user);
    }

    //多个id批量查询
    @Test
    public void testSelectDemo1() {
        List<User> users = userMapper.selectBatchIds(Arrays.asList(1L, 2L, 3L));
        System.out.println(users);
    }

    // 简单条件查询
    @Test
    public void testSelectByMap(){

        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "Jone");
        map.put("age", 18);
        List<User> users = userMapper.selectByMap(map);

        users.forEach(System.out::println);
    }

    // 分页
    @Test
    public void testPage(){

        // 当前位第一页，每页三条记录
        Page<User> page = new Page<>(1, 3);
        userMapper.selectPage(page, null);

        System.out.println(page.getCurrent());
        System.out.println(page.getRecords());//每页数据list集合
        System.out.println(page.getSize());//每页显示记录数
        System.out.println(page.getTotal());//总记录数
        System.out.println(page.getPages());//总页数

        System.out.println(page.hasNext());
        System.out.println(page.hasPrevious());
    }

    //删除操作 物理删除
    @Test
    public void testDeleteById(){
        int result = userMapper.deleteById(1231125349744828417L);
        System.out.println(result);
    }
}
