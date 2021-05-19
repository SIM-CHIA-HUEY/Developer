// Ici c'est la class concrete de l'interface SkillService
package fr.formation.developers.services;

import fr.formation.developers.domain.dtos.SkillCreate;
import fr.formation.developers.domain.dtos.SkillView;
import fr.formation.developers.domain.entities.Skill;
import fr.formation.developers.repositories.SkillRepository;
import org.springframework.stereotype.Service;

@Service
public class SkillServiceImpl implements SkillService {

    private final SkillRepository repository ;

    public SkillServiceImpl (SkillRepository repository){
        this.repository = repository ;
    }

    @Override
    public SkillView getById(Long id) {
        Skill skill = repository.findById(id).get();
        SkillView view = new SkillView();
        view.setName(skill.getName());
        return view;
        //System.out.println("call in service");
        //SkillView skill = new SkillView();
        //skill.setName("Spring boot " + id);
        //return null;
    }

    @Override
    public void create(SkillCreate dto) {
        //System.out.println("call in service");
        //System.out.println(skill);
        Skill skill = new Skill();
        skill.setName(dto.getName());
        repository.save(skill);
    }

    //三 ...puis laisse la machine implémenter la méthode ici aussi, puis remplis la coquille vide avec la bonne méthode.
    @Override
    public SkillView getByName(String name) {
        Skill skill = repository.findByName(name).get();
        SkillView view = new SkillView();
        view.setName(skill.getName());
        return null;
    }


}
