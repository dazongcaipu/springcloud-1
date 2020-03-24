package com.example.servicemenu.service;

import com.example.servicemenu.entity.Menu;

import java.util.List;

public interface IMenuService {
    List<Menu> get();
    Integer getInteger();
    void reset();
}
