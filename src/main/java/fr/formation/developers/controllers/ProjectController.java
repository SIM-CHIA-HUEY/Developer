package fr.formation.developers.controllers;

import fr.formation.developers.domain.dtos.DeveloperUpdate;
import fr.formation.developers.domain.dtos.ProjectCreate;
import fr.formation.developers.domain.dtos.ProjectUpdate;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/project")

public class ProjectController {

    @PostMapping
    public void ProjectCreate (@Valid @RequestBody ProjectCreate projectCreate) {
        System.out.println(projectCreate);
    }

    @PatchMapping
    public void updateProject(@Valid @RequestBody ProjectUpdate partial) {
        System.out.println(partial);

    }
}
