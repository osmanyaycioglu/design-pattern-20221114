package org.training.design.patterns.creational.singleton;

public class MyEagerSingleton {

    private static MyEagerSingleton instance = new MyEagerSingleton();

    public static MyEagerSingleton getInstance() {
        return instance;
    }

    private MyEagerSingleton() {
    }

    public void hello(){
        System.out.println("Hello world");
    }
}
