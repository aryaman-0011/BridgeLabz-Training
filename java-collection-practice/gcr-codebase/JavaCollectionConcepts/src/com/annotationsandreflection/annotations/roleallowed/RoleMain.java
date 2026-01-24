package com.annotationsandreflection.annotations.roleallowed;

public class RoleMain {
    public static void main(String[] args) throws Exception {

        // 🔹 Change role to test
        UserContext.currentRole = "USER";   // try "ADMIN" also

        AdminService service = new AdminService();
        Class<?> cls = service.getClass();

        if (cls.isAnnotationPresent(RoleAllowed.class)) {

            RoleAllowed roleAllowed = cls.getAnnotation(RoleAllowed.class);

            if (roleAllowed.value().equals(UserContext.currentRole)) {
                service.deleteUser();   // allowed
            } else {
                System.out.println("Access Denied!");
            }
        }
    }
}
