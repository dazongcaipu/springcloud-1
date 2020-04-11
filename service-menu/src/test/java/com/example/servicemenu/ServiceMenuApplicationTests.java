package com.example.servicemenu;

import com.example.servicemenu.service.intf.IMenuService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ServiceMenuApplicationTests {

    private final static Logger logger = LoggerFactory.getLogger(ServiceMenuApplicationTests.class);

    @Resource
    IMenuService menuService;

    @Test
    void contextLoads() {
        /*for(int i = 0; i < 20; i++){
            Integer integer = menuService.getInteger();
            String method = integer>0?"run":"fullback";
            logger.info("call {} times,result:{},method:{}", i, integer, method);
        }*/
    }

    @Test
    public void testExecuteCommand() throws InterruptedException {
        /*menuService.reset();
        int i = 1;
        for (; i < 15; i++) {
            CommandUtil.Method<IMenuService> method = (e) -> e.getInteger();
            CommandUtil<IMenuService> command = new CommandUtil<IMenuService>(menuService, method, "menuService", "get");
            Object execute = command.execute();
//            List<Menu> execute = menuService.get();
            String method1 = (Integer) execute == -1 ? "fallback" : "run";
            logger.info("call {} times,result:{},method:{},isCircuitBreakerOpen:{}", i, execute, method1, command.isCircuitBreakerOpen());
        }
        //等待6s，使得熔断器进入半打开状态
        Thread.sleep(6000);
        for (; i < 20; i++) {
            CommandUtil.Method<IMenuService> method = (e) -> e.get();
            CommandUtil<IMenuService> command = new CommandUtil<>(menuService, method, "menuService", "get");
            Object execute = command.execute();
            String method1 = execute == null ? "fallback" : "run";
            logger.info("call {} times,result:{},method:{},isCircuitBre  akerOpen:{}", i, execute, method1, command.isCircuitBreakerOpen());
        }*/
    }
}
