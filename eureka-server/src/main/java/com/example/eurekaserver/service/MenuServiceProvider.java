package com.example.eurekaserver.service;

import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@FeignClient(value = "service-menu")
public interface MenuServiceProvider {

    @RequestMapping("/menu/test2")
    public Integer test();
}
