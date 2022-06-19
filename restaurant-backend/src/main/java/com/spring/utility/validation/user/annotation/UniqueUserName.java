package com.spring.utility.validation.user.annotation;

import com.spring.utility.validation.user.annotation.UserNameConstraintValidation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = UserNameConstraintValidation.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface UniqueUserName {

    public String message() default "UserName already exists";

    public Class<?>[] groups() default {};

//    Constraint annotation, but does not contain a payload parameter.
    public Class<? extends Payload>[] payload() default {};
}
