package org.bearfly;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@Log4j2
@SpringBootApplication
public class JavaPlaygroundApplication {

    public static ConfigurableApplicationContext ac;
    public static void main(String[] args) {
        log.info("BFWorkbenchApplication Starting...");
        ac = SpringApplication.run(JavaPlaygroundApplication.class, args);
        log.info("BFWorkbenchApplication Started");
    }
}
