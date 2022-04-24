package org.bearfly.learn.spring.aop.model;

import lombok.extern.log4j.Log4j2;

/**
 * @author bearfly1990
 * @date 2022/4/24
 */
@Log4j2
public class Host implements Rent{

    @Override
    public void rent() {
        log.info("Rent House");
    }
}
