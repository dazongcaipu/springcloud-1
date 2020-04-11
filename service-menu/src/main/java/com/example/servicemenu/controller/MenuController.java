package com.example.servicemenu.controller;

import com.example.servicemenu.model.entity.Menu;
import com.example.servicemenu.model.entity.MenuExample;
import com.example.servicemenu.mapper.MenuMapper;
import com.example.servicemenu.service.intf.IMenuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;
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

    @RequestMapping(value = "/add")
    public boolean add(@RequestBody Menu menu){
        return menuMapper.insert(menu) > 0;
    }

    @Transactional
    @CacheEvict(value = "menu", key = "#menu.id",condition = "#menu != null")
    @RequestMapping(value = "/update")
    public boolean update(@RequestBody Menu menu){
        MenuExample me = new MenuExample();
        me.createCriteria().andIdEqualTo(menu.getId());
        return menuMapper.updateByExample(menu,me) > 0;
    }

    @Transactional
    @Cacheable(value = "menu",key = "#menuId",unless="#menuId == null")
    @RequestMapping(value = "/get")
    public List<Menu> get(@RequestParam(value = "menuId",required = false)Integer menuId){
        MenuExample me = new MenuExample();
        if(Objects.nonNull(menuId))
            me.createCriteria().andIdEqualTo(menuId);
        return menuMapper.selectByExample(me);
    }

    @CacheEvict(value = "menu", key = "#menuId",condition = "#menuId != null")
    @RequestMapping(value = "/delete")
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
