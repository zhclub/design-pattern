package com.alibet.creational.singleton;

import java.util.HashMap;
import java.util.Map;

public class ContainerSingleton {

    private ContainerSingleton() {
    }

    private static final Map<String, Object> singletonMap = new HashMap<>();

    public static void addInstance(String key, Object instance) {
        if (key != null && !key.isEmpty() && instance != null) {
            if (!singletonMap.containsKey(key)) {
                singletonMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }

}
