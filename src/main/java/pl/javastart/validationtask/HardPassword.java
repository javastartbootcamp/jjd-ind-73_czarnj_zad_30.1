package pl.javastart.validationtask;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = HardPasswordValidator.class)
@Target({ FIELD, PARAMETER })
@Retention(RUNTIME)
public @interface HardPassword {
    String message() default "Value is invalid";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
