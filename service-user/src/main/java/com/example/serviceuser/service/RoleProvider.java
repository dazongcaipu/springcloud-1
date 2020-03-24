package com.example.serviceuser.service;

import com.example.serviceuser.entity.Role;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "service-role")
@RequestMapping("/role")
public interface RoleProvider {

    @RequestMapping(value = "/role",method = RequestMethod.POST)
    List<Role> add(@PathVariable("role") Role role);

    @RequestMapping(value = "/role",method = RequestMethod.PUT)
    List<Role> update(@PathVariable("role") Role role);

    @RequestMapping(value = "/role",method = RequestMethod.GET)
    List<Role> get(@PathVariable("role") Role role);

    @RequestMapping(value = "/role",method = RequestMethod.DELETE)
    List<Role> delete(@PathVariable("roleId") String roleId);
}
