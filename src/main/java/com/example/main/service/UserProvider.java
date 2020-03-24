package com.example.main.service;

import com.example.main.entity.Usr;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "service-user")
@RequestMapping("/user")
public interface UserProvider {

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    List<Usr> add(@PathVariable("user") Usr user);

    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    List<Usr> update(@PathVariable("user") Usr user);

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    List<Usr> get(@PathVariable("user") Usr user);

    @RequestMapping(value = "/user",method = RequestMethod.DELETE)
    List<Usr> delete(@PathVariable("userId") String userId);
}
