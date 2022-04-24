package org.bearfly.learn.spring.xml.model;

import lombok.Data;
import lombok.extern.log4j.Log4j2;

/**
 * @author bearfly1990
 * @date 2022/4/24
 */
@Data
@Log4j2
public class Cat implements Animal{

    @Override
    public void shout() {
        log.info("I'm Cat");
    }
}
