package com.example.servicemedia;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@MapperScan("com.example.servicemedia.mapper")
@SpringBootApplication
@EnableEurekaClient
@EnableCaching
public class ServiceMediaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceMediaApplication.class, args);
    }

}
