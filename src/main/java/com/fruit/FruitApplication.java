package com.fruit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fruit.mapper")
public class FruitApplication {
    public static void main(String[] args){
        /**
         * 约束大于配置
         * 自动Springboot应用
         * 参数1：入口类的类对象
         * 参数2：主函数的形参
         */
        SpringApplication.run(FruitApplication.class,args);

    }
}
