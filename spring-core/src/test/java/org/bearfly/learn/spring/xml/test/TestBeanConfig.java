package org.bearfly.learn.spring.xml.test;

import lombok.extern.log4j.Log4j2;
import org.bearfly.learn.spring.xml.model.Hello;
import org.bearfly.learn.spring.xml.model.User;
import org.bearfly.learn.spring.xml.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author bearfly1990
 * @date 2022/4/23
 */
@Log4j2
public class TestBeanConfig {

    @Test
    public void testHi(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Hello hello = (Hello) context.getBean("hello");
        log.info(hello);
    }

    @Test
    public void testUserService(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) context.getBean("userService");
        log.info(userService.queryUser());

    }

    @Test
    public void testBeanCreate(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user");
        log.info(user);
    }

    @Test
    public void testUserByIndex(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user-by-index");
        log.info(user);
    }

    @Test
    public void testUserByType(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user-by-type");
        log.info(user);
    }


    @Test
    public void testAlias(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) context.getBean("userServiceAlias");
        log.info(userService.queryUser());
    }

    @Test
    public void testAliasbyName(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) context.getBean("userService2");
        log.info(userService.queryUser());
    }

    @Test
    public void testImportResource(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService2");
        log.info(userService.queryUser());
    }


}
