package org.bearfly.learn.spring.mybatis.mapper;

import lombok.Data;
import org.bearfly.learn.spring.mybatis.model.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @author mayn
 * @date 2022/5/1
 */
@Data
public class UserMapperImpl implements UserMapper{
    private SqlSessionTemplate sqlSession;

    @Override
    public List<User> selectUser() {
         UserMapper userMapper =  sqlSession.getMapper(UserMapper.class);
         return userMapper.selectUser();
    }

    @Override
    public int addUser(User user) {
        return 0;
    }

    @Override
    public int deleteUser(int id) {
        return 0;
    }
}
