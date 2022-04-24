package org.bearfly.learn.spring.aop.service;

import lombok.Data;
import lombok.extern.log4j.Log4j2;

/**
 * @author bearfly1990
 * @date 2022/4/24
 */
@Data
@Log4j2
public class UserServiceProxy implements UserService {

    private UserServiceImpl userService;

    @Override
    public void add() {
        log.info("proxy add");
        userService.add();
    }

    @Override
    public void delete() {
        log.info("proxy delete");
        userService.delete();
    }

    @Override
    public void update() {
        log.info("proxy update");
        userService.update();
    }

    @Override
    public void query() {
        log.info("proxy query");
        userService.query();
    }


}
