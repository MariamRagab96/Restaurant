package com.spring.utility.validation.user.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = EmailConstraintValidation.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UniqueEmail {

    public String message() default "Email already exists, Please try another one";

    public Class<?>[] groups() default {};

//    Constraint annotation, but does not contain a payload parameter.
    public Class<? extends Payload>[] payload() default {};

}
