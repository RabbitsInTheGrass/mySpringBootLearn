package com.rabbits.learn.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 测试一下
 * @Author: RabbitsInTheGrass_xj
 * @Date: 2019/10/1 09:31
 */
@RestController
@RequestMapping("/home")
@Api(value = "我的hello层")
public class HomeController {

    @ApiOperation(value = "打招呼", notes = "开始的一个hello")
    @GetMapping("hello")
    public String sayHello() {
        return "Hello RabbitsInTheGrass, welcome!!!";
    }
}