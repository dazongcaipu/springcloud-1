package com.example.main.controller;

import com.example.main.service.UserProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/service-user")
public class UserController {

    @Autowired
    UserProvider userProvider;

}
