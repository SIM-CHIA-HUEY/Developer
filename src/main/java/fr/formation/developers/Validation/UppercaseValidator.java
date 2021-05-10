package fr.formation.developers.Validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

// créer une classe UppercaseValidator ici à utiliser dans l'annotation 'Uppercase'.
public class UppercaseValidator implements ConstraintValidator<Uppercase, String> { //implement l'interface ConstraintValidator
    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        if(value == null){return true;}
        String uppercased = value.toUpperCase();
        return value.equals(uppercased);
    }

    /*
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
                         =(value, certaine condition)

        || Objectif besoin : Value (ce qu'on entre dqns le cors de JSON et retournera comme valeur dans 'Skill')
           doit être en majuscule
        || Solution : Comparer la valeur elle-même, avec la version forcée en majuscule -> Si ... false / true.

        -- Ma solution d'algo --
        · recup name
        · change this name -> name 2 : String to array where 0 = Uppercase
        · compare : name = name2 ?

        -- Solution d'algo du formateur :
        pour pas avoir le "null pointer exception" dans le cas où l'objet n'existe pas, mais ça va pas tout faire planter.
             if(value == null){return true;}
             |-> si c'est pas true, il va l'ignorer et exécuter le reste. Mais 'true' ça fait quoi ?
        value : c'est une
              String uppercased = value.toUpperCase(); //"null pointer exception":appeler une méthode sur un objet qui existe pas. 看上面
              |-> c'est comme si : String uppercased = "toto".toUpperCase();
        toto c'est la valeur qu'on va uppercase !

        -- Notes --
        Jamais '==' dans 'return', utilise 'equals', car on compare les objets ici (et => true/false).
        (la valeur de uppercased) = value du paramètre isValid qui est récupéré de Skills, forcé en Maj.
             return value.equals(uppercased);
             }
     */
}
