package org.bearfly.learn.spring.aop.test;

import lombok.extern.log4j.Log4j2;
import org.bearfly.learn.spring.aop.service.UserService;
import org.bearfly.learn.spring.aop.service.UserServiceImpl;
import org.bearfly.learn.spring.xml.model.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author bearfly1990
 * @date 2022/4/23
 */
@Log4j2
public class TestAOP {
    ApplicationContext context = new ClassPathXmlApplicationContext("beans/beans-aop.xml");

    @Test
    public void testAOP1(){
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

    @Test
    public void testAOP2(){
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

    @Test
    public void testAOP3(){
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

}
