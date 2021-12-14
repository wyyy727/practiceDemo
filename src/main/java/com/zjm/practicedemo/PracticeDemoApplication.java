package com.zjm.practicedemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zjm
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.zjm.practicedemo.**.dao"})
public class PracticeDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticeDemoApplication.class, args);
    }

}
