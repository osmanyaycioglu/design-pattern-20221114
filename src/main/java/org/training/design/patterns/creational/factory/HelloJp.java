package org.training.design.patterns.creational.factory;

public class HelloJp implements IHello {

    @Override
    public String sayHello(String name) {
        return "Hao " + name;
    }

    @Override
    public String desc() {
        return "Japan";
    }

}
