package com.example.zswb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.zswb.dao")
public class ZswbApplication {

    public static void main(String[] args) {

        SpringApplication.run(ZswbApplication.class, args);
    }

}
