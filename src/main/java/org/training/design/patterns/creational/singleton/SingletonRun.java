package org.training.design.patterns.creational.singleton;

public class SingletonRun {

    public static void main(String[] args) {
        MyEagerSingleton.getInstance().hello();
        MyLazySingleton.getInstance().hello();
        MyEnumSingleton.instance.hello();
    }
}
