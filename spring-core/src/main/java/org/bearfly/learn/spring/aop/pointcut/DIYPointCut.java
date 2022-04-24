package org.bearfly.learn.spring.aop.pointcut;

import lombok.Data;
import lombok.extern.log4j.Log4j2;

/**
 * @author bearfly1990
 * @date 2022/4/24
 */

@Data
@Log4j2
public class DIYPointCut {
    public void before(){
        log.info("DIYPointCut before");
    }

    public void after(){
        log.info("DIYPointCut after");
    }
}
