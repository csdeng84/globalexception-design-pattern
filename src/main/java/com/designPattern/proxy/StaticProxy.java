package com.designPattern.proxy;

import org.junit.Test;

public class StaticProxy implements House {

    private House house;

    public StaticProxy(House house) {
        this.house = house;
    }

    @Override
    public void sale() {
        System.out.println("proxy is running..");
        house.sale();
        System.out.println("proxy is ending..");
    }
}
