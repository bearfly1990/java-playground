package org.bearfly.learn.spring.mybatis.test;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.bearfly.learn.spring.mybatis.mapper.UserMapper;
import org.bearfly.learn.spring.mybatis.model.User;
import org.junit.Test;

import org.apache.ibatis.io.Resources;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author mayn
 * @date 2022/4/30
 */
@Log4j2
public class MybatisTest {
    @Test
    public void testBaseMybatis() throws IOException {
        String resources = "mybatis-config.xml";
        InputStream in = Resources.getResourceAsStream(resources);

        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = sessionFactory.openSession(true);

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.selectUser();

        for (User user: userList){
            System.out.println(user);
        }
    }

    @Test
    public void testMybatisSpring(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        for (User user:userMapper.selectUser()){
            System.out.println(user);
        }
    }

    @Test
    public void testMybatisSpring2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper userMapper = context.getBean("userMapper2", UserMapper.class);
        for (User user:userMapper.selectUser()){
            System.out.println(user);
        }
    }

    @Test
    public void testMybatisSpring3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper userMapper = context.getBean("userMapper2", UserMapper.class);

        List<User> userList = userMapper.selectUser();

        for (User user:userList){
            System.out.println(user);
        }
    }

}
