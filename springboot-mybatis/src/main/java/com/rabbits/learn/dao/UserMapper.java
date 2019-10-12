package com.rabbits.learn.dao;

import com.rabbits.learn.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Description:
 * @Author: RabbitsInTheGrass_xj
 * @Date: 2019/10/1 20:39
 */
@Component
@Mapper
public interface UserMapper {

    /**
     * @return int
     * @Description 新增用户信息
     * @Param [record] 用户信息
     **/
    int insert(User record);

    /**
     * @return User用户信息
     * @Description 根据主键id查询用户信息
     * @Param id 键ID
     **/
    User selectByPrimaryKey(Integer id);

    /**
     * @return int
     * @Description 根据主键id更新用户信息
     * @Param [record] 用户
     **/
    int updateByPrimaryKey(User record);

    /**
     * @return int
     * @Description 根据主键id删除用户信息
     * @Param [id] 主键id
     **/
    int deleteByPrimaryKey(Integer id);

    /**
     * @return 用户信息列表
     * @Description 查询用户信息列表
     **/
    List<User> selectAll();
}
