package com.example.serviceuser.controller;

import com.example.serviceuser.model.entity.Usr;
import com.example.serviceuser.model.entity.UsrExample;
import com.example.serviceuser.mapper.UsrMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
public class UserController {

    @Autowired
    private UsrMapper userMapper;

    @Cacheable(value = "user",key = "'redisTest'")
    @RequestMapping(value = "/redisTest")
    public String redisTest(){
        return "redisTest";
    }

    @RequestMapping(value = "/add")
    public boolean add(@RequestBody Usr user){
        return userMapper.insert(user) > 0;
    }

    @CacheEvict(value = "user", key = "#user.id",condition = "#user != null")
    @RequestMapping(value = "/update")
    public boolean update(@RequestBody Usr user){
        UsrExample me = new UsrExample();
        me.createCriteria().andIdEqualTo(user.getId());
        return userMapper.updateByExample(user,me) > 0;
    }

    @Cacheable(value = "user",key = "#userId",condition="#userId != null")
    @RequestMapping(value = "/get")
    public List<Usr> get(@RequestParam(value = "userId",required = false)Integer userId){
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        UsrExample me = new UsrExample();
        if(Objects.nonNull(userId))
            me.createCriteria().andIdEqualTo(userId);
        return userMapper.selectByExample(me);
    }

    @CacheEvict(value = "user", key = "#userId",condition = "#userId != null")
    @RequestMapping(value = "/delete")
    public boolean delete(@RequestParam(value = "userId", required = false)Integer userId, @RequestParam(value = "userIdList", required = false)List<Integer> userIdList){
        UsrExample me = new UsrExample();
        if(Objects.nonNull(userId)){
            me.createCriteria().andIdEqualTo(userId);
        }
        if (Objects.nonNull(userIdList)){
            userIdList.stream().forEach(i -> {
                me.createCriteria().andIdEqualTo(i);
            });
        }
        if(Objects.isNull(userId) && Objects.isNull(userIdList)){
            return true;
        }
        return userMapper.deleteByExample(me) > 0;
    }
}
