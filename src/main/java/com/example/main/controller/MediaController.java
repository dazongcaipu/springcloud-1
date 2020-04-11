package com.example.main.controller;

import com.example.main.service.intf.MediaProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/service-media")
public class MediaController {

    @Autowired
    MediaProvider mediaProvider;


}
