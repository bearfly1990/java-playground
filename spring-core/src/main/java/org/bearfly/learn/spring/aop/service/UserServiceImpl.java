package org.bearfly.learn.spring.aop.service;

import lombok.extern.log4j.Log4j2;

/**
 * @author bearfly1990
 * @date 2022/4/24
 */
@Log4j2
public class UserServiceImpl implements UserService{

    @Override
    public void add() {
        log.info("add");
    }

    @Override
    public void delete() {
        log.info("delete");
    }

    @Override
    public void update() {
        log.info("update");
    }

    @Override
    public void query() {
        log.info("query");
    }
}
