package com.company.creational.singleton;

public class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String value){
        this.value = value;
    }

    public static Singleton getInstace(String value){
        if (instance == null){
            instance = new Singleton(value);
        }
        return instance;
    }
}
