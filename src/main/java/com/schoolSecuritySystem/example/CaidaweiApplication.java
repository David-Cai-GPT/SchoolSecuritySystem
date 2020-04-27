package com.schoolSecuritySystem.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
@EnableScheduling
@SpringBootApplication
@EnableTransactionManagement
@ComponentScan("com.schoolSecuritySystem")
@MapperScan("com.schoolSecuritySystem.dao")
public class CaidaweiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CaidaweiApplication.class, args);
    }

    private DataSource dataSource;
}
