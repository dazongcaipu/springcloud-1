package com.example.servicerole.service.impl;

import com.example.servicerole.entity.Role;
import com.example.servicerole.entity.RoleExample;
import com.example.servicerole.mapper.RoleMapper;
import com.example.servicerole.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService {

    @Autowired
    RoleMapper roleMapper;

    @Override
    public List<Role> get() {
        return roleMapper.selectByExample(new RoleExample());
    }
}
