package org.training.design.patterns;

import org.training.design.patterns.creational.singleton.MyLazySingleton;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Cay cay = new Cay();
        cay.caymiktari = 10;
        MyLazySingleton.getInstance().hello();
    }
}
