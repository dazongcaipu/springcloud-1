package com.example.main.controller;

import com.example.main.service.MenuProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/service-menu")
public class MenuController {

    @Autowired
    MenuProvider menuProvider;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return menuProvider.test1();
    }

    @RequestMapping("/test1")
    @ResponseBody
    public String test1(){
        return "我是好人";
    }

}
