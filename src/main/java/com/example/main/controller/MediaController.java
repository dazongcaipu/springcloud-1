package com.example.main.controller;

import com.example.main.entity.Media;
import com.example.main.service.MediaProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/service-media")
public class MediaController {

    @Autowired
    MediaProvider mediaProvider;

    @RequestMapping("/test")
    @ResponseBody
    public List<Media> test(){
        return mediaProvider.get(null);
    }

    @RequestMapping("/test1")
    @ResponseBody
    public String test1(){
        return "我是好人";
    }

}
