package com.designPattern.proxy;

import com.designPattern.proxy.CgLibtest;
import com.designPattern.proxy.House;
import com.designPattern.proxy.JdkDacmicProxy;
import com.designPattern.proxy.StaticProxy;
import com.designPattern.proxy.XiaoMingSale;
import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;

import java.lang.reflect.Proxy;

public class Main {
    /**
     * 静态代理类
     */
    @Test
    public void staticProxy() {
        StaticProxy proxy = new StaticProxy(new XiaoMingSale());
        proxy.sale();
    }

    /**
     * 动态态代理类
     */
    @Test
    public void dymicProxy() {
        XiaoMingSale xm = new XiaoMingSale();
        JdkDacmicProxy proxy = new JdkDacmicProxy(xm);
        House house = (House) Proxy.newProxyInstance(xm.getClass().getClassLoader(),
                xm.getClass().getInterfaces(), proxy);
        house.sale();
    }

    @Test
    public void cglib() {
        CgLibtest cglib = new CgLibtest();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(XiaoMingSale.class);
        enhancer.setCallback(cglib);
        House house = (House) enhancer.create();
        house.sale();
    }


}
