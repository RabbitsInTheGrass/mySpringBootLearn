package com.rabbits.learn.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Description: Swagger2配置信息
 * @Author: RabbitsInTheGrass_xj
 * @Date: 2019/10/4 10:36
 */
@Configuration
@EnableSwagger2
@ConditionalOnProperty(name = "spring.swagger.enable", havingValue = "true")
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(buildApiInf())
                .select()
                //扫描的swagger接口包路径
                .apis(RequestHandlerSelectors.basePackage("com.rabbits.learn.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo buildApiInf() {
        return new ApiInfoBuilder()
                //标题
                .title("RabbitsInTheGrass的用Swagger2构建RESTful API文档")
                .description("更多SpringBoot相关文章请关注：https://blog.csdn.net/RabbitInTheGrass")
                .termsOfServiceUrl("https://blog.csdn.net/RabbitInTheGrass/article/details/102026732")
                //作者
                .contact(new Contact("RabbitInTheGrass", "https://blog.csdn.net/RabbitInTheGrass", "xiqiyeyou@163.com"))
                //版本
                .version("1.0")
                .build();
    }
}