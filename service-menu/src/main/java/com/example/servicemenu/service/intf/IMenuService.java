package com.example.servicemenu.service.intf;

import com.example.servicemenu.model.entity.Menu;

import java.util.List;

public interface IMenuService {
    List<Menu> get();
    Integer getInteger();
    void reset();
}
