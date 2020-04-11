package com.example.main.controller;

import com.example.main.service.intf.RoleProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/service-role")
public class RoleController {

    @Autowired
    RoleProvider roleProvider;

}
