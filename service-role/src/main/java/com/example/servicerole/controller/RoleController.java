package com.example.servicerole.controller;

import com.example.servicerole.entity.Role;
import com.example.servicerole.entity.RoleExample;
import com.example.servicerole.mapper.RoleMapper;
import com.example.servicerole.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
public class RoleController {

    @Autowired
    IRoleService service;

    @Autowired
    RoleMapper roleMapper;

    @RequestMapping("/test")
    public List<Role> get(){
        return service.get();
    }


    @RequestMapping(value = "/role",method = RequestMethod.POST)
    public boolean add(@RequestBody Role role){
        return roleMapper.insert(role) > 0;
    }

    @RequestMapping(value = "/role",method = RequestMethod.PUT)
    public boolean update(@RequestBody Role role){
        RoleExample me = new RoleExample();
        me.createCriteria().andRoleidEqualTo(role.getRoleid());
        return roleMapper.updateByExample(role,me) > 0;
    }

    @RequestMapping(value = "/role",method = RequestMethod.GET)
    public List<Role> get(@RequestParam(value = "roleId",required = false)String roleId){
        RoleExample me = new RoleExample();
        if(Objects.nonNull(roleId))
            me.createCriteria().andRoleidEqualTo(roleId);
        return roleMapper.selectByExample(me);
    }

    @RequestMapping(value = "/role",method = RequestMethod.DELETE)
    public boolean delete(@RequestParam(value = "roleId", required = false)String roleId, @RequestParam(value = "roleIdList", required = false)List<String> roleIdList){
        RoleExample me = new RoleExample();
        if(Objects.nonNull(roleId)){
            me.createCriteria().andRoleidEqualTo(roleId);
        }
        if (Objects.nonNull(roleIdList)){
            roleIdList.stream().forEach(i -> {
                me.createCriteria().andRoleidEqualTo(i);
            });
        }
        if(Objects.isNull(roleId) && Objects.isNull(roleIdList)){
            return true;
        }
        return roleMapper.deleteByExample(me) > 0;
    }
}
