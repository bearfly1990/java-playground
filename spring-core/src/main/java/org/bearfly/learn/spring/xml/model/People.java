package org.bearfly.learn.spring.xml.model;

import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author bearfly1990
 * @date 2022/4/24
 */
@Data
@Log4j2
public class People {
//    @Resource(name="cat2")
    @Autowired
    @Qualifier(value="dog2")
    Dog dog;
    @Autowired
    @Qualifier(value="cat1")
    Cat cat;
    String name;
}
