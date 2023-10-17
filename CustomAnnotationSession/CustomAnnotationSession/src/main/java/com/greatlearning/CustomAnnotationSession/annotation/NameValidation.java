package com.greatlearning.CustomAnnotationSession.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NameValidator.class)
public @interface NameValidation {

    public String message() default "Invalid name: valid Names are \"shaik\", \"nasiha\", \"kowsar\"";
    public Class<?>[] groups() default {};

//additional information about annotation
    public Class<? extends Payload>[] payload() default {};
}
