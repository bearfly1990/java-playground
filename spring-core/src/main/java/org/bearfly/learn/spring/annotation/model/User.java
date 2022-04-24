package org.bearfly.learn.spring.annotation.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author bearfly1990
 * @date 2022/4/24
 */
@Data
@Component
@Scope("prototype")
public class User {
    @Value("bearfly")
    private String name;

//    @Value("bearfly")
    public void setName(String name){
        this.name = name;
    }
}
