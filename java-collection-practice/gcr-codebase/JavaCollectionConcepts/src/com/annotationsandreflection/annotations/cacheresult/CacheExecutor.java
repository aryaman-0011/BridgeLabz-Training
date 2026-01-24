package com.annotationsandreflection.annotations.cacheresult;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

class CacheExecutor {

    private static final Map<String, Object> cache = new HashMap<>();

    public static Object execute(Object obj, String methodName, Object... args)
            throws Exception {

        Class<?> cls = obj.getClass();
        Method method = cls.getMethod(methodName, int.class);

        String key = methodName + "-" + args[0];

        if (method.isAnnotationPresent(CacheResult.class)) {

            if (cache.containsKey(key)) {
                System.out.println("Returning cached result");
                return cache.get(key);
            }

            Object result = method.invoke(obj, args);
            cache.put(key, result);
            return result;
        }

        return method.invoke(obj, args);
    }
}
