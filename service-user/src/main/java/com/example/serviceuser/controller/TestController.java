package com.example.serviceuser.controller;

import com.example.serviceuser.model.entity.Usr;
import com.example.serviceuser.model.entity.UsrExample;
import com.example.serviceuser.mapper.UsrMapper;
import com.example.serviceuser.service.intf.IUsrService;
import com.example.serviceuser.service.intf.MenuProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    IUsrService service;
    @Autowired
    UsrMapper usrMapper;
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    MenuProvider menuProvider;

    private final static String SERVICE_MENU="http://localhost:8765/menu/";

    @RequestMapping("/test")
    public List<Usr> test(){
        return usrMapper.selectByExample(new UsrExample());
    }

    @RequestMapping("/test1")
    public String test1(){
        return restTemplate.getForObject(SERVICE_MENU+"test1",String.class, (Object) null);
    }

}
