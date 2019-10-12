package com.rabbits.learn.controller;

import com.alibaba.druid.stat.DruidStatManagerFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: Druid监控
 * @Author: RabbitsInTheGrass_xj
 * @Date: 2019/10/7 19:32
 */
@RestController
public class DruidStatController {

    private static final Logger logger = LoggerFactory.getLogger(DruidStatController.class);

    @GetMapping("/druid/stat")
    public Object druidStat() {
        /*
         DruidStatManagerFacade.getDataSourceStatDataList该方法可以获取所有数据源的监控数据，
         除此之外 DruidStatManagerFacade还提供了一些其他方法，可按需选择使用。
         */
        logger.info("--------------/druid/stat----------------");
        return DruidStatManagerFacade.getInstance().getDataSourceStatDataList();
    }
}