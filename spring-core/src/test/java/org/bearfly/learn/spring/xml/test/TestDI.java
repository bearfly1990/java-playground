package org.bearfly.learn.spring.xml.test;

import lombok.extern.log4j.Log4j2;
import org.bearfly.learn.spring.xml.model.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author bearfly1990
 * @date 2022/4/23
 */
@Log4j2
public class TestDI {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void testHi(){
        Student student = (Student) context.getBean("student");
        log.info(student);
    }

}
