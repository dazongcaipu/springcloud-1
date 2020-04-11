package com.example.serviceuser;

import com.example.serviceuser.mapper.UsrMapper;
import com.example.serviceuser.service.intf.MenuProvider;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ServiceUserApplicationTests {

    @Autowired
    MenuProvider menuProvider;

    @Autowired
    UsrMapper usrMapper;

    private final static Logger logger = LoggerFactory.getLogger(ServiceUserApplicationTests.class);

    @Test
    void contextLoads() {
//        List<Usr> usrs = usrMapper.selectByExample(new UsrExample());
//        System.out.println(usrs.toString());
    }

    /*@Test
    public void testCommandUtil() {
//        CommandUtil.Method<MenuFeignClient> method = (e) -> e.test();
//        Object r = new CommandUtil<MenuFeignClient>(menuFeignClient,method,"menuService","test1").execute();
        List test = menuProvider.get(1);
        logger.info("result:{}====", test);
    }*/
}
