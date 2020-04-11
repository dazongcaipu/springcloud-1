package com.example.main.controller;

import com.example.main.model.entity.Media;
import com.example.main.model.entity.Menu;
import com.example.main.model.entity.Roles;
import com.example.main.model.entity.Usr;
import com.example.main.service.intf.MediaProvider;
import com.example.main.service.intf.MenuProvider;
import com.example.main.service.intf.RoleProvider;
import com.example.main.service.intf.UserProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/main")
public class MainController {

    @Autowired
    MenuProvider menuProvider;
    @Autowired
    UserProvider userProvider;
    @Autowired
    RoleProvider roleProvider;
    @Autowired
    MediaProvider mediaProvider;

    @RequestMapping("/test1")
    @ResponseBody
    public List<Menu> test1(Integer menuId){
        return menuProvider.get(menuId);
    }

    @RequestMapping("/test2")
    @ResponseBody
    public List<Usr> test2(Integer userId){
        return userProvider.get(userId);
    }

    @RequestMapping("/test3")
    @ResponseBody
    public List<Roles> test3(Integer roleId){
        return roleProvider.get(roleId);
    }

    @RequestMapping("/test4")
    @ResponseBody
    public List<Media> test(Integer mediaId){
        return mediaProvider.get(mediaId);
    }

}
