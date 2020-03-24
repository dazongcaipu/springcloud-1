package com.example.servicemedia.service;

import com.example.servicemedia.entity.Menu;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "service-menu")
@RequestMapping("/menu")
public interface menuProvider {

    @RequestMapping(value = "/menu",method = RequestMethod.POST)
    List<Menu> add(@PathVariable("menu")Menu menu);

    @RequestMapping(value = "/menu",method = RequestMethod.PUT)
    List<Menu> update(@PathVariable("menu")Menu menu);

    @RequestMapping(value = "/menu",method = RequestMethod.GET)
    List<Menu> get(@PathVariable("menu")Menu menu);

    @RequestMapping(value = "/menu",method = RequestMethod.DELETE)
    List<Menu> delete(@PathVariable("menuId")String menuId);
}
