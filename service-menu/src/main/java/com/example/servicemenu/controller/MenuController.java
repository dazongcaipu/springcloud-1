package com.example.servicemenu.controller;

import com.example.servicemenu.entity.Menu;
import com.example.servicemenu.entity.MenuExample;
import com.example.servicemenu.mapper.MenuMapper;
import com.example.servicemenu.service.IMenuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
public class MenuController {

    private final static Logger logger = LoggerFactory.getLogger(MenuController.class);

    @Autowired
    MenuMapper menuMapper;

    @Autowired
    IMenuService service;

    @RequestMapping("/test")
    public List<Menu> get(){
        return service.get();
    }

    @RequestMapping("/test1")
    public String get1(){
        return "123321";
    }

    @RequestMapping(value = "/menu",method = RequestMethod.POST)
    public boolean add(@RequestBody Menu menu){
        return menuMapper.insert(menu) > 0;
    }

    @RequestMapping(value = "/menu",method = RequestMethod.PUT)
    public boolean update(@RequestBody Menu menu){
        MenuExample me = new MenuExample();
        me.createCriteria().andIdEqualTo(menu.getId());
        return menuMapper.updateByExample(menu,me) > 0;
    }

    @RequestMapping(value = "/menu",method = RequestMethod.GET)
    public List<Menu> get(@RequestParam(value = "menuId",required = false)Integer menuId){
        MenuExample me = new MenuExample();
        if(Objects.nonNull(menuId))
            me.createCriteria().andIdEqualTo(menuId);
        return menuMapper.selectByExample(me);
    }

    @RequestMapping(value = "/menu",method = RequestMethod.DELETE)
    public boolean delete(@RequestParam(value = "menuId", required = false)Integer menuId, @RequestParam(value = "menuIdList", required = false)List<Integer> menuIdList){
        MenuExample me = new MenuExample();
        if(Objects.nonNull(menuId)){
            me.createCriteria().andIdEqualTo(menuId);
        }
        if (Objects.nonNull(menuIdList)){
            menuIdList.stream().forEach(i -> {
                me.createCriteria().andIdEqualTo(i);
            });
        }
        if(Objects.isNull(menuId) && Objects.isNull(menuIdList)){
            return true;
        }
        return menuMapper.deleteByExample(me) > 0;
    }
}
