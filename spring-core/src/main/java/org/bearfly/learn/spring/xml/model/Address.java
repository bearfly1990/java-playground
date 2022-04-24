package org.bearfly.learn.spring.xml.model;

import lombok.Data;

/**
 * @author bearfly1990
 * @date 2022/4/23
 */
@Data
public class Address {
    private String country;
    public Address(){

    }
    public Address(String country){
        this.country = country;
    }
}
