package org.bearfly.learn.spring.xml.test;

import lombok.extern.log4j.Log4j2;
import org.bearfly.learn.spring.xml.model.Address;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author bearfly1990
 * @date 2022/4/24
 */
@Log4j2
public class TestSchema {
    @Test
    public void testP(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans/beans-schema.xml");
        Address address = context.getBean("address", Address.class);
        log.info(address);
    }

    @Test
    public void testC(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans/beans-schema.xml");
        Address address = context.getBean("address2", Address.class);
        log.info(address);
    }
}
