package com.sxxh.cdsp.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //把当前类作为Spring的配置类
@EnableAutoConfiguration //开启自动配置
/*
 * 开启Spring的组件扫描，使用这个注解时，可以指定要扫描的包，
 * 如果指定了，就从指定的包开始扫描，如果不指定，就从启动引导类的位置开始扫描
 */
@ComponentScan(basePackages = "com.sxxh")
@MapperScan(basePackages = "com.sxxh.cdsp.dao")
public class CustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class,args);
    }

}
