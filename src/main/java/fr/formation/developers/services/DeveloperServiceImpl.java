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


    @Override
    public DeveloperView getByPseudo(String pseudo){

        DeveloperView developer = new DeveloperView();
        developer.setPseudo(pseudo);
        developer.setFirstName("Chia Huey");
        developer.setLastName("SIM");
        LocalDate date = LocalDate.of(1989, 10, 27);
        developer.setBirthDate(date);
        System.out.println(developer);
        return null;
    }


    @Override
    public void create(DeveloperCreate developer) {
        DeveloperCreate developerCreate = new DeveloperCreate();
        create(developer);

    }

    @Override
    public void updateBirthDate(String pseudo, DeveloperUpdate partial) {
        pseudo(pseudo);
        updateBirthDate(partial.getBirthDate);

);
        System.out.println("Update birth date of:" + pseudo +
                " with new date :" + partial.getBirthDate());
    }
}
