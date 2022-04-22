package com.numerlAlt.NumerAlt.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PasswordMatchesValidator.class)
@Documented
public @interface PasswordMatches {
    String message() default "mot de passe et confirmation doivent être identiques";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
