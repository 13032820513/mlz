package com.mlz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mlz.mapper.mapping")
public class MlzDaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MlzDaoApplication.class, args);
    }

}

