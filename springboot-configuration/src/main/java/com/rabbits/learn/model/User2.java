package com.rabbits.learn.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author xj
 * @Date 2019-10-12 15:59
 */
@Component
@ConfigurationProperties(prefix = "rabbits.user")
public class User2 {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}