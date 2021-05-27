package com.laoblogs.myblogs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.laoblogs.myblogs.mapper")
@SpringBootApplication
public class MyblogsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyblogsApplication.class, args);
    }

}
