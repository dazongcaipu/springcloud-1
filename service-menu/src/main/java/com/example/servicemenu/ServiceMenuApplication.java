package com.example.servicemenu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@MapperScan("com.example.servicemenu.mapper")
@SpringCloudApplication
@EnableEurekaClient
@EnableHystrix
@EnableZuulProxy
@RibbonClient(value = "service-menu")
public class ServiceMenuApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceMenuApplication.class, args);
    }

}
