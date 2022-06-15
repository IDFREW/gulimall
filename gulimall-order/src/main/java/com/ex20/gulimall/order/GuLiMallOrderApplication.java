package com.ex20.gulimall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>创建时间: 2022年06月14日 12:45 </p>
 *
 * @author 高诚政
 */
@SpringBootApplication
@MapperScan("com.ex20.gulimall.order.dao")
public class GuLiMallOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(GuLiMallOrderApplication.class,args);
    }
}
