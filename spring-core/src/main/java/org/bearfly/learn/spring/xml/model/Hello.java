package org.bearfly.learn.spring.xml.model;

import lombok.Data;
import lombok.extern.log4j.Log4j2;

/**
 * @author bearfly1990
 * @date 2022/4/23
 */
@Data
@Log4j2
public class Hello {
    private String hi;

    public static void main(String[] args) {
        log.info("In Hello Body");
    }
}
