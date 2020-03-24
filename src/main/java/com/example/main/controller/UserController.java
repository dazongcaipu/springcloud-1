package com.example.main.controller;

import com.example.main.entity.Usr;
import com.example.main.service.UserProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/service-user")
public class UserController {

    @Autowired
    UserProvider userProvider;

    @RequestMapping("/test")
    @ResponseBody
    public List<Usr> test(){
        return userProvider.get(null);
    }

    @RequestMapping("/test1")
    @ResponseBody
    public String test1(){
        return "我是好人";
    }

}
