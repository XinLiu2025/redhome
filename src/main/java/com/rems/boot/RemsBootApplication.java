package com.rems.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author liuxin
 * @Date 2024/10/10
 * @Description rems 启动类
 * @Version 1.0
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.rems.boot.mapper")
public class RemsBootApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(RemsBootApplication.class, args);
    }
    
}
