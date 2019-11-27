package com.designPattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JdkDacmicProxy implements InvocationHandler {
    private Object obj;

    public JdkDacmicProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("JdkDacmicProxy start invoke...");
        Object ret = method.invoke(obj, args);
        System.out.println("JdkDacmicProxy end invoke...");
        return ret;
    }
}
