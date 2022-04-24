package org.bearfly.learn.spring.xml.model;

import lombok.Data;
import lombok.extern.log4j.Log4j2;

/**
 * @author bearfly1990
 * @date 2022/4/23
 */
@Data
@Log4j2
public class User {
    private int id;
    private String name;
    public User(){
       log.info("No Parameter Construct!");
    }

    public User(String name){
        this.name = name;
    }

    public User(int id, String name){
        this.id = id;
        this.name = name;
    }

}
