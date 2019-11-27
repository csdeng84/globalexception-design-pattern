package com.annotation;


import org.junit.Test;

import java.util.ArrayList;

public class AnnotationDemo extends Object {

    private int number;

    /**
     * 去除警告
     */
    @SuppressWarnings("all")
    public void test1() {

        int count = 0;
        ArrayList<String> list = new ArrayList<>();
    }

    @MyAnnotation(value = "hello", beadId = 1)
    class MyClass {
        private void test() {

        }
    }

    /**
     * 过时的方法
     */
    @Deprecated
    @MyAnnotation(value = "hello", beadId = 1)
    @Test
    public void test2() {
        MyClass c = new MyClass();
        MyAnnotation ann = c.getClass().getAnnotation(MyAnnotation.class);
        System.out.println(ann.value());
    }
}
