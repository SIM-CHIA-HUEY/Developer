package fr.formation.developers.domain.entities;

import javax.persistence.*;

@Entity //pour dire que ça c'est une table, donc il permet à l'objet de mapper avec une table
@Table(name = "skills") // demander au back de créer le schéma dans le BD

public class Skill {

    @Id // Dans une table y'a une clé primaire = dans IJ y'a un ID. Ce sont les équivalents.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // objet null pour framework, if ID null -> envoie INSERT à la BD ; else : __

    @Column(name = "skill_name",nullable = false) //pas obligé de mettre 'nullable = false'
    private String name ;

    public Skill(){
        //
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


}
