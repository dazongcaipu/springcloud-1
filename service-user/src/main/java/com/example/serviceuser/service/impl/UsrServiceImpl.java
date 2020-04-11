package com.example.serviceuser.service.impl;

import com.example.serviceuser.model.entity.Usr;
import com.example.serviceuser.model.entity.UsrExample;
import com.example.serviceuser.mapper.UsrMapper;
import com.example.serviceuser.service.intf.IUsrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsrServiceImpl implements IUsrService {

    @Autowired
    UsrMapper userMapper;

    @Override
    public List<Usr> get() {
        return userMapper.selectByExample(new UsrExample());
    }
}
