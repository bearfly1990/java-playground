package org.bearfly.learn.spring.xml.model;

import lombok.Data;
import lombok.extern.log4j.Log4j2;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author bearfly1990
 * @date 2022/4/23
 */
@Data
@Log4j2
public class Student {
    private String name;
    private Address address;
    private String[] books;
    private List<String> hobbies;
    private Map<String, String> card;
    private Set<String> game;
    private String child;

    public void setName(String name) {
        log.warn("Call Student.setName");
        this.name = name;
    }

    private Properties info;


}
