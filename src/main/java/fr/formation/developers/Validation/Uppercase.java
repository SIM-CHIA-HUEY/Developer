package fr.formation.developers.Validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = {UppercaseValidator.class}) //= {quelle classe est concernée par UppercaseValidator},
  // @Constraint = ici, sa contrainte de validation est UpperCaseValidator.

public @interface Uppercase {
    String message () default "Doit être en majuscule";
    Class<?> [] groups () default {}; // = marche sur array/string/payload(qui est déclaré en bas, obligatoirement)
    Class<? extends Payload>[] payload() default {};
}
