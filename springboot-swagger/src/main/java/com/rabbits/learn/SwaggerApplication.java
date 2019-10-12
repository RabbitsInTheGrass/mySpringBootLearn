package com.rabbits.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Description SwaggerApplication 类
 * @Author RabbitsInTheGrass_xj
 * @Date 2019-10-12 15:36
 */
@EnableSwagger2
@SpringBootApplication
public class SwaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerApplication.class, args);
    }

}
