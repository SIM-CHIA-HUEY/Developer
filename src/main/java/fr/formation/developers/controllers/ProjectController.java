package fr.formation.developers.controllers;

import fr.formation.developers.domain.dtos.ProjectCreate;
import fr.formation.developers.domain.dtos.ProjectDelete;
import fr.formation.developers.domain.dtos.ProjectUpdate;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;

@RestController
@RequestMapping("/project")

public class ProjectController {

    @PostMapping
    public void ProjectCreate (@Valid @RequestBody ProjectCreate projectCreate) {
        System.out.println(projectCreate);
    }

    @PatchMapping("/{name}")
    public void updateProject(@PathVariable ("name") String name, @Valid @RequestBody ProjectUpdate partial) {

        System.out.println("Update " + name + " : " + partial); // You should declare name in 'ProjectUpdate' to show it in console

    }

    @DeleteMapping("/{name}")
    public void deleteProject(@PathVariable("name") String name, @Valid @RequestBody ProjectDelete project){
        //ProjectDelete toBeDeleted = new ProjectDelete("Hello");
        project.setProjectName(name); //changer le name
        System.out.println(project);
        }

}
