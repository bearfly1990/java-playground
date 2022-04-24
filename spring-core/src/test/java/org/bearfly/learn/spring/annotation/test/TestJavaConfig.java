package org.bearfly.learn.spring.annotation.test;

import lombok.extern.log4j.Log4j2;
import org.bearfly.learn.spring.annotation.config.MyConfig;
import org.bearfly.learn.spring.annotation.model.People;
import org.bearfly.learn.spring.annotation.model.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author bearfly1990
 * @date 2022/4/24
 */
@Log4j2
public class TestJavaConfig {
    @Test
    public void testJavaConfig(){
        //如果完全使用了配置类方式去做，我们就只能通过AnnotationConfig上下文来获取容器，通过配置类的class对象加载;
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        People user = context.getBean("people", People.class);

    }
}
