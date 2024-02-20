package pl.javastart.validationtask;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class HardPasswordValidator implements ConstraintValidator<HardPassword, String> {
    @Override
    public void initialize(HardPassword constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return s.matches(".*[A-Z].*") && s.matches(".*[a-z].*") && s.matches(".*[!#$%^&?*].*");
    }
}
