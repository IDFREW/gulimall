package com.ex20.gulimall.gatway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient /* 开启服务注册发现 */
public class GuLiMallGatWayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuLiMallGatWayApplication.class, args);
    }

}
