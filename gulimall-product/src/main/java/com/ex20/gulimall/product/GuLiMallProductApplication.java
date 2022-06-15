package com.ex20.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>创建时间: 2022年06月14日 12:46 </p>
 * 如何使用Mybatis中的逻辑删除
 *  1. 配置全局的逻辑删除规则 (可省略)
 *  2. 配置逻辑删除的组件 (可省略)
 *  3. 给Bean加上逻辑删除注解@TableLogic
 * @author 高诚政
 */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.ex20.gulimall.product.dao")
public class GuLiMallProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(GuLiMallProductApplication.class,args);
    }
}
