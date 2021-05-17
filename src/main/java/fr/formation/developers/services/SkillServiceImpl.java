package fr.formation.developers.services;

import fr.formation.developers.domain.dtos.SkillView;
import org.springframework.stereotype.Service;

@Service
public class SkillServiceImpl implements SkillService {

    @Override
    public SkillView getById(Long id) {
        System.out.println("call in service");
        SkillView skill = new SkillView();
        skill.setName("Spring boot " + id);
        return null;
    }
}
