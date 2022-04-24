package org.bearfly.learn.spring.annotation.test;

import lombok.extern.log4j.Log4j2;
import org.bearfly.learn.spring.annotation.model.User;
import org.bearfly.learn.spring.xml.model.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author bearfly1990
 * @date 2022/4/24
 */
@Log4j2
public class TestAnnotation {
    @Test
    public void testComponent(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans/beans-annotation.xml");
        User user = context.getBean("user", User.class);

    }
}
