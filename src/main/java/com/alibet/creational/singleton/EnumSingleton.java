package com.alibet.creational.singleton;

public enum EnumSingleton {
    INSTANCE;

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }

    EnumSingleton(){

    }

}
