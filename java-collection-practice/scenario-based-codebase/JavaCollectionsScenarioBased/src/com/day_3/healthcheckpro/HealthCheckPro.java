package com.day_3.healthcheckpro;

import java.lang.reflect.Method;

public class HealthCheckPro {

    public static void scanController(Class<?> controllerClass) {
        System.out.println("🔍 Scanning Controller: " + controllerClass.getSimpleName());
        System.out.println("");

        Method[] methods = controllerClass.getDeclaredMethods();

        for (Method method : methods) {

            boolean isPublicAPI = method.isAnnotationPresent(PublicAPI.class);
            boolean isAuth = method.isAnnotationPresent(RequiresAuth.class);

            // Validation Check
            if (!isPublicAPI && !isAuth) {
                System.out.println("Method " + method.getName() + " is missing API annotations!");
                continue;
            }

            // Documentation Generation
            System.out.println("API Method: " + method.getName());

            if (isPublicAPI) {
                PublicAPI api = method.getAnnotation(PublicAPI.class);
                System.out.println("   -> Type: Public API");
                System.out.println("   -> Description: " + api.description());
            }

            if (isAuth) {
                RequiresAuth auth = method.getAnnotation(RequiresAuth.class);
                System.out.println("   -> Requires Authentication");
                System.out.println("   -> Role: " + auth.role());
            }

            System.out.println();
        }
    }
}
