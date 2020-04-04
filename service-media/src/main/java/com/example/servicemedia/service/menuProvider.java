package com.example.servicemedia.service;

import com.example.servicemedia.entity.Menu;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "service-menu")
@RequestMapping("/menu")
public interface menuProvider {

    @RequestMapping(value = "/add")
    List<Menu> add(@RequestParam("menu") Menu menu);

    @RequestMapping(value = "/update")
    List<Menu> update(@RequestParam("menu") Menu menu);

    @RequestMapping(value = "/get")
    List<Menu> get(@RequestParam(value = "menuId") Integer menuId);

    @RequestMapping(value = "/delete")
    List<Menu> delete(@RequestParam(value = "menuId", required = false) Integer menuId, @RequestParam(value = "menuIdList", required = false) List<Integer> menuIdList);

}
