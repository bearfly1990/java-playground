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
public class TestBeanScope {
    @Test
    public void testPrototype(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans/beans-schema.xml");
        Address address1 = context.getBean("address3", Address.class);
        Address address2 = context.getBean("address3", Address.class);
        log.info(address1.hashCode());
        log.info(address2.hashCode());
        log.info(address1 == address2);
        address1.setCountry("A1");
        address2.setCountry("A2");
        log.info(address1.hashCode());
        log.info(address2.hashCode());
        log.info(address1);
        log.info(address2);
        log.info(address1 == address2);
    }
}
