package com.rabbits.learn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description MybatisApplication 类
 * @Author RabbitsInTheGrass_xj
 * @Date 2019-10-12 15:36
 */
@SpringBootApplication
@MapperScan("com.rabbits.learn.dao")
public class MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisApplication.class, args);
    }

}
