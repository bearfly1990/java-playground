package org.bearfly.learn.spring.aop;

import org.bearfly.learn.spring.aop.proxy.ProxyInvocationHandler;
import org.bearfly.learn.spring.aop.service.UserService;
import org.bearfly.learn.spring.aop.service.UserServiceImpl;

/**
 * @author bearfly1990
 * @date 2022/4/24
 */
public class Client3 {

    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        ProxyInvocationHandler handler = new ProxyInvocationHandler();
        handler.setTarget(userService);
        UserService proxy = (UserService) handler.getProxy();
        proxy.delete();
    }
}
