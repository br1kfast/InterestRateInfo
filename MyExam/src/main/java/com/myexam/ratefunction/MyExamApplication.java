package com.myexam.ratefunction;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author JunFei
 * @data
 * @purpose 启动类
 */
@MapperScan(basePackages = {"com.myexam.ratefunction.mapper"})
@SpringBootApplication
public class MyExamApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyExamApplication.class, args);
    }

}
