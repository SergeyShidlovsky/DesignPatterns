package com.company.creational.singleton;

public class DemoSingletonThread {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Singleton singleton = Singleton.getInstace("FIRST");
        Singleton sexondSingleton = Singleton.getInstace("Second");
        System.out.println(singleton.value);
        System.out.println(sexondSingleton.value);
    }
}
