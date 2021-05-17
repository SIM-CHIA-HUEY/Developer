package fr.formation.developers.services;

import fr.formation.developers.domain.dtos.SkillCreate;
import fr.formation.developers.domain.dtos.SkillView;
import org.springframework.stereotype.Service;
// class concrete
@Service
public class SkillServiceImpl implements SkillService {

    @Override
    public SkillView getById(Long id) {
        System.out.println("call in service");
        SkillView skill = new SkillView();
        skill.setName("Spring boot " + id);
        return null;
    }

    @Override
    public void create(SkillCreate skill) {
        System.out.println("call in service");
        System.out.println(skill);
    }
}
