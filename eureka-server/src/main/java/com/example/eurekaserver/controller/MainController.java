package com.example.eurekaserver.controller;

import com.example.eurekaserver.service.MenuServiceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class MainController {

    @Autowired
    MenuServiceProvider menuServiceProvider;

    @RequestMapping("/test")
    public Integer test(){
        return menuServiceProvider.test();
    }
}
