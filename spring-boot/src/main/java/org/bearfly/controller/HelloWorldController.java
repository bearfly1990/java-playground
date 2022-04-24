package org.bearfly.controller;

import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bearfly1990
 * @date 2022/4/21
 */
@Log4j2
@Data
@RestController
public class HelloWorldController {
    String test;
    @RequestMapping("/hello")
    public String index() {
        log.error("hello");
        return "Hello World";
    }
}