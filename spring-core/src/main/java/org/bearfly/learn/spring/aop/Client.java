package org.bearfly.learn.spring.aop;

import org.bearfly.learn.spring.aop.model.Host;
import org.bearfly.learn.spring.aop.model.Proxy;

/**
 * @author bearfly1990
 * @date 2022/4/24
 */
public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
