package com.annotationsandreflection.annotations.roleallowed;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)   // class-level
public @interface RoleAllowed {
    String value();
}
