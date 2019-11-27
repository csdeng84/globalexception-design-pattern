package com.designPattern;

class Singleton {

    private static volatile Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (null == singleton) {
            synchronized (Singleton.class) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }
}


public class SingletonDemo {

    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);

        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Singleton singleton1 = Singleton.getInstance();
                    Singleton singleton2 = Singleton.getInstance();
                    System.out.println(singleton1 == singleton2);
                }
            }).start();

        }
    }

}
