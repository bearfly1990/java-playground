package org.bearfly.learn.spring.xml.test;

import lombok.extern.log4j.Log4j2;
import org.bearfly.learn.spring.xml.model.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author bearfly1990
 * @date 2022/4/24
 */
@Log4j2
public class TestAutowire {
    @Test
    public void testDog(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans/beans-autowire.xml");
        People people1 = context.getBean("people1", People.class);
        people1.getCat().shout();
        people1.getDog().shout();
        log.info(people1);

        People people2 = context.getBean("people2", People.class);
        people2.getCat().shout();
        people2.getDog().shout();
        log.info(people2);

    }
}
