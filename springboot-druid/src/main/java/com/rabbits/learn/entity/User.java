package com.rabbits.learn.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description:
 * @Author: RabbitsInTheGrass_xj
 * @Date: 2019/10/6 20:35
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 793100833087044040L;

    private Integer id;
    private String userName;
    private String userPsw;
    private String idCard;
    private String phone;
    private String address;
    private Integer state;
}
