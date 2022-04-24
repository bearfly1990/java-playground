package org.bearfly.learn.spring.aop.proxy;

import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.bearfly.learn.spring.aop.model.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author bearfly1990
 * @date 2022/4/24
 */
@Data
@Log4j2
public class ProxyInvocationHandler implements InvocationHandler {
    private Object target;

    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(target, args);
        return result;
    }

}