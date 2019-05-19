package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * Created by Ryan on 2019/5/19/0019
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {


    @Autowired
    Environment environment;


    public Docket docket(){
        Profiles profiles = Profiles.of("prod");
        boolean isEnable = environment.acceptsProfiles(profiles);
        return  new Docket(DocumentationType.SWAGGER_2).enable(!isEnable);
//                .select().apis(RequestHandlerSelectors.basePackage("com.example.controller")).build();
    }

//    private ApiInfo apiInfo(){
//        Contact contact = new Contact("张三", "aaa.com", "123@qq.com");
//        return  new ApiInfo("Swagger学习文档",
//                "这是学习Swagger时生成的文档信息",
//                "v1.0","http://localhost:8080",contact,
//                "",
//                "",
//                new ArrayList<>()
//        );
//    }
}
