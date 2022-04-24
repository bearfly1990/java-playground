package org.bearfly.learn.spring.aop.model;

import lombok.Data;
import lombok.extern.log4j.Log4j2;

/**
 * @author bearfly1990
 * @date 2022/4/24
 */
@Data
@Log4j2
public class Proxy implements Rent{
    private Host host;

    public Proxy(Host host){
        this.host = host;
    }

    @Override
    public void rent() {
        host.rent();
    }
    public void seeHouse(){
        log.info("Look house!");
    }
    public void doContract(){
        log.info("do Contract!");
    }
    public void fare(){
        log.info("get fare");
    }
}
