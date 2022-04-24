package org.bearfly.learn.spring.annotation.config;

import org.bearfly.learn.spring.annotation.model.People;
import org.bearfly.learn.spring.annotation.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author bearfly1990
 * @date 2022/4/24
 */
//这个也会被Spring容器托管，注册到容器中，因为他本来就是一个@Component
//@Configuration代表这是一个配置类，替代beans.xml
@Configuration
@ComponentScan("org.bearfly")
@Import(MyConfig2.class)
public class MyConfig {
    //注册一个bean, 就相当于我们之前写的一个bean标签
    //这个方法的名字，就相当于bean标签中的id属性
    //这个方法的返回值，就相当于bean标签中的class
    @Bean
    public People people(){
        return new People();
    }
}
