package fr.formation.developers.repositories;

import fr.formation.developers.domain.entities.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface SkillRepository extends JpaRepository <Skill, Long> {
    Optional<Skill> findByName(String name);
    // 四 ..ici il implimentera ça mais attention, il faut faire les changements adéquates !


}
