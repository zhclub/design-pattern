package com.alibet.creational.singleton;

import java.lang.reflect.Constructor;

public class Test {

    public static void main(String[] args) throws Exception {

        testContainerSingleton();

        testInnerClassSingleton();
        testEnumSingleton();

    }

    /**
     * 静态内部类：可以使用反射的方式非法破坏
     *
     * @throws Exception
     */
    private static void testInnerClassSingleton() throws Exception {
        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();

        Constructor<? extends StaticInnerClassSingleton> constructor = StaticInnerClassSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        StaticInnerClassSingleton newInstance = constructor.newInstance();
        System.out.println(instance == newInstance);
    }

    /**
     * 枚举：由于枚举本身的特性，是无法执行初始化方法的，所以可以防止反射破坏
     *
     * @throws Exception
     */
    private static void testEnumSingleton() throws Exception {
        EnumSingleton instance = EnumSingleton.getInstance();

        Constructor<? extends EnumSingleton> constructor = instance.getClass().getDeclaredConstructor();
        constructor.setAccessible(true);
        EnumSingleton newInstance = constructor.newInstance();
        System.out.println(instance == newInstance);
    }

    private static void testContainerSingleton(){
        Object o = new Object();
        Object o2 = new Object();

        ContainerSingleton.addInstance("root", o);
        ContainerSingleton.addInstance("root", o2);
        Object root = ContainerSingleton.getInstance("root");

        System.out.println(o == root);
        System.out.println(o2 == root);
    }
}
