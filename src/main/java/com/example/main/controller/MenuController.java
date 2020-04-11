package com.example.main.controller;

import com.example.main.service.intf.MenuProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/service-menu")
public class MenuController {

    @Autowired
    MenuProvider menuProvider;

}
