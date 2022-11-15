package org.training.design.patterns.creational.factory;

public class HelloFactory2 {


    public static IHello createHello(int index){
        IHello hello = null;
        switch (index) {
            case 1:
                hello = new HelloEng();
                break;
            case 2:
                hello = new HelloTr();
                break;
            case 3:
                hello = new HelloEsp();
                break;
            case 4:
                hello = new HelloJp();
                break;
            default:
                return null;
        }
        return hello;
    }

    public static void showMenu(){
        System.out.println("1-English");
        System.out.println("2-Turkish");
        System.out.println("3-Spanish");
        System.out.println("4-Japan");

    }

}
