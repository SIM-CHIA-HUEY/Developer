package fr.formation.developers.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;

public class IsAdultValidator  implements ConstraintValidator<IsAdult, LocalDate> {
    @Override
    public boolean isValid(LocalDate localDate, ConstraintValidatorContext constraintValidatorContext) {
        int year = localDate.getYear();
        year = year - 18 ;
        if( year > 18){
            return true;
        }
        return false;
    }
}
