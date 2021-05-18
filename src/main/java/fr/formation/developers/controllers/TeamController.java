package fr.formation.developers.controllers;

import fr.formation.developers.domain.dtos.TeamCreate;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/team")

public class TeamController {
    /*
    //Step 1. Simple mapping : an endpoint that identifies an entity with a primary key
    --in other words, just to show the String (variable -> {...}) entered at the end of the URL in Postman

    -- CODE -- GetMapping + getByGroup (?) + PathVariable
        @GetMapping("/{naming}")
        public String getByGroup (@PathVariable ("naming") String naming){
        return naming ;}

    //Step 2. Use method-level composed annotations, to handle different types of incoming HTTP request methods
    -- they are Get, Post, Put, Delete, Patch, and @RequestMapping is already included (in the URL) !
    -- @GetMapping : to handle GET type of request method, @PostMapping : to handle POST type of request method, etc.
    -- in other words, to show your attribut 'TeamName' in 'TeamCreate' class, and enter the variable -> {...} in Postman, and show it in Postman.
    -- CODE -- GetMapping + getByGroup (?) + PathVariable

     */
        @GetMapping("/{naming}") public TeamCreate
        getByGroup (@PathVariable ("naming") String naming){
        TeamCreate newTeam = new TeamCreate();
        newTeam.setTeamName(naming);
        System.out.println(newTeam);
        return newTeam;
        }

        /*
    //Step 3. Same as 2. but with requestBody
    -- maps the HttpRequest body to a transfer or domain object, enabling automatic deserialization
    -- of the inbound HttpRequest body onto a Java object.
    --- In other words, it's about the JAVA <-> JSON in Postman;
    --- in Postman -> Body -> raw -> JSON : {"teamName" : "write whatever you want here"},
    --- and 'teamName' is the same as in 'TeamCreate' = what is Return in the Get statement !

    --CODE-- PostMapping + 'Class' + PathVariable + Valid + RequestBody
        @PostMapping("/team/{name}")
        public void TeamCreate (@PathVariable String name,
               @Valid @RequestBody TeamCreate teamCreate){
        System.out.println(name + teamCreate);}

    //Step 4. Same as 3, by adding boolean in 'TeamCreate' Class (there was only 'TeamName' until step 3).

         */

    @PostMapping("/{name}")
    public void TeamCreate (@PathVariable String name,
                            @Valid @RequestBody TeamCreate teamCreate){
        System.out.println(name + teamCreate);
    }

    @DeleteMapping ("/{name}")
    public void deleteTeam (@PathVariable ("name") String name) {
        TeamCreate team = new TeamCreate("Sunshine", true);

        if (team.getTeamName().equals(name)){ // getter = obtenir le type du champs/valeur de l'objet (ici : en string) => string = string : OK
            System.out.println("You successfully deleted : " + team);
        } else {
            System.out.println("Delete operation failed.");
        }
    }


}
