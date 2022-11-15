package org.training.design.patterns.creational.singleton;

public enum MyEnumSingleton {
    instance;

    public void hello(){
        System.out.println("Hello world");
    }
}
