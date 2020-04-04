package com.example.servicemedia.service;

import com.example.servicemedia.entity.Usr;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "service-user")
@RequestMapping("/user")
public interface UserProvider {

    @RequestMapping(value = "/add")
    List<Usr> add(@RequestParam("user") Usr user);

    @RequestMapping(value = "/update")
    List<Usr> update(@RequestParam("user") Usr user);

    @RequestMapping(value = "/get")
    List<Usr> get(@RequestParam(value = "userId", required = false) Integer userId);

    @RequestMapping(value = "/delete")
    List<Usr> delete(@RequestParam("userId") Integer userId);
}
