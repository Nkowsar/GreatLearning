package com.greatlearning.CustomAnnotationSession.annotation;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class NameValidator implements ConstraintValidator<NameValidation,String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        List<String> list= Arrays.asList(new String[]{"shaik","nasiha","kowsar"});
        return list.contains(s);
    }
}
