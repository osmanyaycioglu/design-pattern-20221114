package org.training.design.patterns.creational.factory;

public class HelloEsp implements IHello {

    @Override
    public String sayHello(String name) {
        return "Ola " + name;
    }

    @Override
    public String desc() {
        return "Spanish";
    }


}
