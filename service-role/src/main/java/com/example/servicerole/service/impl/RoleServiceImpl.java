package com.example.servicerole.service.impl;

import com.example.servicerole.model.entity.Roles;
import com.example.servicerole.model.entity.RolesExample;
import com.example.servicerole.mapper.RolesMapper;
import com.example.servicerole.service.intf.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService {

    @Autowired
    RolesMapper roleMapper;

    @Override
    public List<Roles> get() {
        return roleMapper.selectByExample(new RolesExample());
    }
}
