package com.rabbits.learn.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.rabbits.learn.dao.UserMapper;
import com.rabbits.learn.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: RabbitsInTheGrass_xj
 * @Date: 2019/10/6 21:12
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * @return com.github.pagehelper.PageInfo<User>
     * @Description 分页查询用户信息
     * @Param [pageNum, pageSize] 分页信息
     **/
    public PageInfo<User> selectAll(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<User> userList = userMapper.selectAll();
        return new PageInfo<>(userList);
    }

    /**
     * @return int
     * @Description 新增用户
     * @Param [user] 用户信息
     **/
    public int addUser(User user) {
        return userMapper.insert(user);
    }

    /**
     * @return int
     * @Description 更新用户信息
     * @Param [user] 用户
     **/
    public int updateUser(User user) {
        return userMapper.updateByPrimaryKey(user);
    }

    /**
     * @return int
     * @Description 根据ID删除用户
     * @Param [userId] 用户ID
     **/
    public int deleteUser(int userId) {
        return userMapper.deleteByPrimaryKey(userId);
    }

    /**
     * @return User
     * @Description 根据用户ID查询用户
     * @Param [userId] 用户ID
     **/
    public User selectByPrimaryKey(int userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}
