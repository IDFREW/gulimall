package com.ex20.gulimall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>创建时间: 2022年06月14日 12:42 </p>
 * @author 高诚政
 */
@SpringBootApplication
@MapperScan("com.ex20.gulimall.coupon.dao")
@EnableDiscoveryClient
public class GuLiMallCouponApplication {
    public static void main(String[] args) {
        SpringApplication.run(GuLiMallCouponApplication.class,args);
    }
}
