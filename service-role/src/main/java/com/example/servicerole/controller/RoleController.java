package com.example.servicerole.controller;

import com.example.servicerole.model.entity.Roles;
import com.example.servicerole.model.entity.RolesExample;
import com.example.servicerole.mapper.RolesMapper;
import com.example.servicerole.service.intf.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
public class RoleController {

    @Autowired
    IRoleService service;

    @Autowired
    RolesMapper roleMapper;

    @RequestMapping(value = "/add")
    public boolean add(@RequestBody Roles role){
        return roleMapper.insert(role) > 0;
    }

    @CacheEvict(value = "role", key = "#role.id",condition = "#role != null")
    @RequestMapping(value = "/update")
    public boolean update(@RequestBody Roles role){
        RolesExample me = new RolesExample();
        me.createCriteria().andIdEqualTo(role.getId());
        return roleMapper.updateByExample(role,me) > 0;
    }

    @Cacheable(value = "role",key = "#roleId",unless="#roleId == null")
    @RequestMapping(value = "/get")
    public List<Roles> get(@RequestParam(value = "roleId",required = false)Integer roleId){
        RolesExample me = new RolesExample();
        if(Objects.nonNull(roleId))
            me.createCriteria().andIdEqualTo(roleId);
        return roleMapper.selectByExample(me);
    }

    @CacheEvict(value = "role", key = "#roleId",condition = "#roleId != null")
    @RequestMapping(value = "/delete")
    public boolean delete(@RequestParam(value = "roleId", required = false)Integer roleId, @RequestParam(value = "roleIdList", required = false)List<Integer> roleIdList){
        RolesExample me = new RolesExample();
        if(Objects.nonNull(roleId)){
            me.createCriteria().andIdEqualTo(roleId);
        }
        if (Objects.nonNull(roleIdList)){
            roleIdList.stream().forEach(i -> {
                me.createCriteria().andIdEqualTo(i);
            });
        }
        if(Objects.isNull(roleId) && Objects.isNull(roleIdList)){
            return true;
        }
        return roleMapper.deleteByExample(me) > 0;
    }
}
