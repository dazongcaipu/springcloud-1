package com.example.servicerole;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@MapperScan("com.example.servicerole.mapper")
@SpringBootApplication
@EnableEurekaClient
public class ServiceRoleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRoleApplication.class, args);
    }

}
