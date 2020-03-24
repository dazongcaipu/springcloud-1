package com.example.servicemenu.service.impl;

import com.example.servicemenu.entity.Menu;
import com.example.servicemenu.entity.MenuExample;
import com.example.servicemenu.mapper.MenuMapper;
import com.example.servicemenu.service.IMenuService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class MenuServiceImpl implements IMenuService {

    private final static Logger logger = LoggerFactory.getLogger(MenuServiceImpl.class);
    private AtomicInteger counter = new AtomicInteger(0);
    @Autowired
    MenuMapper menuMapper;

    @HystrixCommand
    @Override
    public List<Menu> get() {
        return menuMapper.selectByExample(new MenuExample());
    }


    @HystrixCommand(
            commandProperties = {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "500")}
//            ,fallbackMethod  = "getIntegerFullback"
//            ,defaultFallback = "getIntegerDefault"
    )
    @Override
    public Integer getInteger() {
        int c = counter.getAndIncrement();
        if (logger.isDebugEnabled()) {
            logger.debug("OrderIdCounter:{}", c);
        }
        if (c < 10) {
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
            }
        }
        return c;
    }
    public Integer getIntegerFullback() {
        int c = counter.getAndIncrement() + 100;
        if (logger.isDebugEnabled()) {
            logger.debug("OrderIdCounter:{}", c);
        }
        if (c < 10) {
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
            }
        }
        return c;
    }

    @Override
    public void reset() {
        counter.getAndSet(0);
    }
}
