package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * springboot 启动类
 */
@SpringCloudApplication
@EnableEurekaServer
@EnableFeignClients
public class SpringCloudsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudsApplication.class, args);
    }

}
