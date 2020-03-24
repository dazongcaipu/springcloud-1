package com.example.serviceuser;

import com.example.serviceuser.entity.Usr;
import com.example.serviceuser.entity.UsrExample;
import com.example.serviceuser.mapper.UsrMapper;
import com.example.serviceuser.service.MenuProvider;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ServiceUserApplicationTests {

    @Autowired
    MenuProvider menuProvider;

    @Autowired
    UsrMapper usrMapper;

    private final static Logger logger = LoggerFactory.getLogger(ServiceUserApplicationTests.class);

    @Test
    void contextLoads() {
        List<Usr> usrs = usrMapper.selectByExample(new UsrExample());
        System.out.println(usrs.toString());
    }

    @Test
    public void testCommandUtil() {
//        CommandUtil.Method<MenuFeignClient> method = (e) -> e.test();
//        Object r = new CommandUtil<MenuFeignClient>(menuFeignClient,method,"menuService","test1").execute();
        List test = menuProvider.test();
        logger.info("result:{}====", test);
    }
}
