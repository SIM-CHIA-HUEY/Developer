package fr.formation.developers.services;

import fr.formation.developers.domain.dtos.DeveloperCreate;
import fr.formation.developers.domain.dtos.DeveloperUpdate;
import fr.formation.developers.domain.dtos.DeveloperView;
import fr.formation.developers.domain.entities.Developer;
import fr.formation.developers.domain.entities.Skill;
import fr.formation.developers.repositories.DeveloperRepository;
import fr.formation.developers.repositories.SkillRepository;
import org.springframework.stereotype.Service;

//import javax.validation.Valid;

@Service
public class DeveloperServiceImpl implements DeveloperService {
// ici on crée la classe concrète où on met tout

    private final DeveloperRepository developerRepo;
    private final SkillRepository skillRepo ;

    public DeveloperServiceImpl (DeveloperRepository developerRepo, SkillRepository skillRepo){
        this.developerRepo = developerRepo;
        this.skillRepo = skillRepo;
    }

    @Override
    public DeveloperView getByPseudo(String pseudo){
        Developer entity = developerRepo.findByPseudo(pseudo).get();
        DeveloperView view = new DeveloperView();
        view.setPseudo(entity.getPseudo());
        view.setFirstName(entity.getFirstName());
        view.setLastName(entity.getLastName());
        view.setBirthDate(entity.getBirthDate());
        return view;
    }

    // pour récup les données de 'dtos - DeveloperCreate', et les mettre dans le tableau 'entities - Developer'
    @Override
    public void create(DeveloperCreate dto) {
        Developer entity = new Developer();
        //create(entity);
        entity.setPseudo(dto.getPseudo());
        entity.setFirstName(dto.getFirstName());
        entity.setLastName(dto.getLastName());
        entity.setBirthDate(dto.getBirthDate());
        Long mainSkillId = dto.getMainSkillId();
        // 2 possibilités pour une association avec un objet préexistant :
        // Skill skill = skillRepo.findById(mainSkillId).get(); // 1.faire appel à la BD avec find, dc vérifie si ressource existe ;
        Skill skill = skillRepo.getOne(mainSkillId); // 2.ne fait pas appel à la DB, juste mettre l'ID, dc pas de vérification,
                                                    // dc erreur si Validations et relations pas bien fait ds le back. Mais meilleure perf !
        entity.setMainSkill(skill);
        developerRepo.save(entity);
    }

    @Override
    public void updateBirthDate(String pseudo, DeveloperUpdate dto) {
        /*
          @Valid : avant ligne 83 (avant d'exécuter la méthode), pour verif si le input est valide pr garantir que les données soient cohérentes dans l'application
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
        Developer entity = developerRepo.findByPseudo(pseudo).get();
        entity.setBirthDate(dto.getBirthDate());
        developerRepo.save(entity);
        //System.out.println("Update birth date of:" + pseudo + " with new date :" + dto.getBirthDate());
    }

    @Override
    public DeveloperView find() {
        Developer entity = developerRepo.findByFirstNameAndLastName("SIM", "Chia Huey").get();
        DeveloperView viewTwo = new DeveloperView();
        viewTwo.setPseudo(entity.getPseudo());
        viewTwo.setFirstName(entity.getFirstName());
        viewTwo.setLastName(entity.getLastName());
        viewTwo.setBirthDate(entity.getBirthDate());
        return viewTwo;
    }
}
