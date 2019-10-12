package com.rabbits.learn.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Description User类
 * @Author RabbitsInTheGrass_xj
 * @Date 2019-10-02 15:36
 */
@Component
public class User {

    @Value("${rabbits.user.name}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}