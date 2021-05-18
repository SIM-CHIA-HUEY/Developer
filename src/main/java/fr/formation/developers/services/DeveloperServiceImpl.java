package fr.formation.developers.services;

import fr.formation.developers.domain.dtos.DeveloperCreate;
import fr.formation.developers.domain.dtos.DeveloperUpdate;
import fr.formation.developers.domain.dtos.DeveloperView;
import fr.formation.developers.domain.dtos.SkillView;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.time.LocalDate;

@Service
public class DeveloperServiceImpl implements DeveloperService {
// ici on crée la classe concrète où pn met tout

    @Override
    public DeveloperView getByPseudo(String pseudo){

        DeveloperView developer = new DeveloperView();
        developer.setPseudo(pseudo);
        developer.setFirstName("Chia Huey");
        developer.setLastName("SIM");
        LocalDate date = LocalDate.of(1989, 10, 27);
        developer.setBirthDate(date);
        System.out.println(developer);
        return developer;
    }


    @Override
    public void create(DeveloperCreate developer) {
        DeveloperCreate developerCreate = new DeveloperCreate();
        create(developer);
    }

    @Override
    public void updateBirthDate(String pseudo, DeveloperUpdate partial) {
        /**
         * @Valid : avant ligne 83 (avant d'exécuter la méthode), pour verif si le input est valide pr garantir que les données soient cohérentes dans l'application
         *         // @RequestBody : attend le body dans Postman. Object JAVA <-> JSON. Faut donc entrer les données dans Postman (ss format JSON, car c'est ce qu'on utilise)
         *         // pour qu'on le voit dans la console ici.
         *
         *        // System.out.println("Partial object=" + partial);
         *        // DeveloperCreate developer = new DeveloperCreate();
         *        // developer.setPseudo(pseudo); // Variable de chemin
         *        // developer.setFirstName(partial.getFirstName()); // Anomalie
         *        // developer.setLastName("MARSHALL");
         *        // developer.setBirthDate(partial.getBirthDate()); // JSON
         *        // System.out.println("New object=" + developer);
         */

        System.out.println("Update birth date of:" + pseudo + " with new date :" + partial.getBirthDate());
    }
}
