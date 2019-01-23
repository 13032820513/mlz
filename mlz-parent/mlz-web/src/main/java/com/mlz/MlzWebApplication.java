package com.mlz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.mlz")
@MapperScan(basePackages = {"com.mlz.mapper"})
public class MlzWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MlzWebApplication.class, args);
    }

}

