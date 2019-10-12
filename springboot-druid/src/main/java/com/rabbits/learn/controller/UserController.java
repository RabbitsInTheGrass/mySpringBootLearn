package com.rabbits.learn.controller;

import com.rabbits.learn.entity.User;
import com.rabbits.learn.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description: 用户信息
 * @Author: RabbitsInTheGrass_xj
 * @Date: 2019/10/1 09:31
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @GetMapping("/selectAllUser")
    @ResponseBody
    public Object selectAll(@RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,
                            @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize) {
        logger.info("============查询所有用户=======");
        return userService.selectAll(pageNum, pageSize);
    }

    @PostMapping("/addUser")
    @ResponseBody
    public int addUser(User user) {
        return userService.addUser(user);
    }

    @PostMapping("/updateUser")
    @ResponseBody
    public int updateUser(User user) {
        return userService.updateUser(user);
    }

    @PostMapping("/deleteUser")
    @ResponseBody
    public int deleteUser(User user) {
        return userService.deleteUser(user.getId());
    }
}
