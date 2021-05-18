package fr.formation.developers.services;

import fr.formation.developers.domain.dtos.DeveloperCreate;
import fr.formation.developers.domain.dtos.DeveloperUpdate;
import fr.formation.developers.domain.dtos.DeveloperView;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

public interface DeveloperService {

    DeveloperView getByPseudo (String pseudo);

    void create (DeveloperCreate developer);

    void updateBirthDate (@PathVariable("nom") String pseudo,
                          @Valid @RequestBody DeveloperUpdate partial);

}
