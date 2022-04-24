package org.bearfly.learn.spring.xml.service.impl;

import lombok.Data;
import org.bearfly.learn.spring.xml.dao.UserDao;
import org.bearfly.learn.spring.xml.service.UserService;

/**
 * @author bearfly1990
 * @date 2022/4/23
 */
@Data
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    @Override
    public String queryUser() {
        return userDao.queryUser();
    }
}
