package org.training.design.patterns;

import org.training.design.patterns.creational.singleton.MyLazySingleton;

public class Araba {
    private int hiz;
    private int uzaklik;


    public void ileri() {
        MyLazySingleton.getInstance()
                       .hello();
    }

    public void geri() {

    }

    public void don() {

    }
}
