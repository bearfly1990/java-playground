package org.bearfly.learn.spring.mybatis.mapper;

import org.bearfly.learn.spring.mybatis.model.User;

import java.util.List;

/**
 * @author mayn
 * @date 2022/4/30
 */
public interface UserMapper {
    public List<User> selectUser();
    public int addUser(User user);
    public int deleteUser(int id);
}
