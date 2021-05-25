package fr.formation.developers.repositories;

import fr.formation.developers.domain.entities.Developer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DeveloperRepository extends JpaRepository <Developer, Long> {
    Optional<Developer> findByPseudo(String pseudo);
    Optional<Developer> findByFirstNameAndLastName(String firstName, String lastName);
    // @Repository est optionnelle quand on fait un JpaRepository, car dedans y'a déjà tout.
}
