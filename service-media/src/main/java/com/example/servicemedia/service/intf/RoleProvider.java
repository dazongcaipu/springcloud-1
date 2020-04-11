package com.example.servicemedia.service.intf;

import com.example.servicemedia.model.entity.Roles;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "service-role")
@RequestMapping("/role")
public interface RoleProvider {

    @RequestMapping(value = "/add")
    List<Roles> add(@RequestParam("role") Roles role);

    @RequestMapping(value = "/update")
    List<Roles> update(@RequestParam("role") Roles role);

    @RequestMapping(value = "/get")
    List<Roles> get(@RequestParam(value = "roleId", required = false) Integer roleId);

    @RequestMapping(value = "/delete")
    List<Roles> delete(@RequestParam(value = "roleId") Integer roleId, @RequestParam(value = "roleIdList") List<Integer> roleIdList);
}
