package com.zjm.practicedemo;

import com.zjm.practicedemo.user.dao.UserMapper;
import com.zjm.practicedemo.user.modal.UserEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class SampleTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<UserEntity> userList = userMapper.selectList(null);
        //Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }

    public static void main(String[] args) {
        System.out.println(1);
    }
}
