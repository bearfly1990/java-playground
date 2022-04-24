package org.bearfly.learn.spring.xml.dao.impl;

import org.bearfly.learn.spring.xml.dao.UserDao;

/**
 * @author bearfly1990
 * @date 2022/4/23
 */
public class UserDaoMysql implements UserDao {

    @Override
    public String queryUser() {
        return "Mysql Dao";
    }
}
