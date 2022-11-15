package org.training.design.patterns.creational.singleton;

public class MyLazySingleton {

    private static volatile MyLazySingleton instance;

    public static MyLazySingleton getInstance() {
        if (instance == null) {
            synchronized (MyEagerSingleton.class) {
                if (instance == null) {
                    instance = new MyLazySingleton();
                }
            }
        }
        return instance;
    }

    private MyLazySingleton() {
    }

    public void hello() {
        System.out.println("Hello world");
    }
}
