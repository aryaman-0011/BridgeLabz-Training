package com.annotationsandreflection.annotations.jsonfield;

import java.lang.reflect.Field;

class JsonSerializer {

    public static String toJson(Object obj) {

        StringBuilder json = new StringBuilder("{");
        Class<?> cls = obj.getClass();
        Field[] fields = cls.getDeclaredFields();

        boolean first = true;

        try {
            for (Field field : fields) {

                if (field.isAnnotationPresent(JsonField.class)) {

                    field.setAccessible(true);

                    JsonField jf = field.getAnnotation(JsonField.class);
                    String key = jf.name();
                    Object value = field.get(obj);

                    if (!first) {
                        json.append(", ");
                    }

                    json.append("\"").append(key).append("\": ");

                    if (value instanceof String) {
                        json.append("\"").append(value).append("\"");
                    } else {
                        json.append(value);
                    }

                    first = false;
                }
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        json.append("}");
        return json.toString();
    }
}
