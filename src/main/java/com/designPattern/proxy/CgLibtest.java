package com.designPattern.proxy;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CgLibtest implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects,
                            MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib start ...");
        Object obj = methodProxy.invokeSuper(o, objects);
        System.out.println("cglib start ...");
        return obj;
    }
}
