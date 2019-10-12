package com.rabbits.learn.controller;

import com.rabbits.learn.model.User;
import com.rabbits.learn.model.User2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description HomeController类
 * @Author RabbitsInTheGrass_xj
 * @Date 2019-10-12 15:41
 */
@RestController
public class HomeController {

    @Autowired
    private User user;

    @Autowired
    private User2 user2;

    @RequestMapping("/")
    String home() {
        return user.getName() + "***" + user2.getName();
    }

}