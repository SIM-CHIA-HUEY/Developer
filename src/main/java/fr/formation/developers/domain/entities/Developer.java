package fr.formation.developers.domain.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "developers")
public class Developer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column(name="pseudonyme", unique = true, nullable = false)
    private String pseudo ;

    @Column(name="first_name", nullable = false)
    private String firstName ;

    @Column(name="last_name", nullable = false)
    private String lastName ;

    @Column(name="birth_date", nullable = false)
    private LocalDate birthDate ;

    /** Pour faire les tables d'association : prendre les cardinalités max du MCD, et voir si c'est
     *      @ManyToOne Many developers to One skill, pour Hibernate sur cmt lire cette annotation
     *  @JoinColumn : Colonne de jointure (name = "main_skill_id", nullable = false), mais c'est optionnel.
     */
    @ManyToOne
    @JoinColumn (name = "main_skill_id", nullable = false)
    private Skill mainSkill ;


    public Developer(){
        // constructeur vide
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getPseudo() {
        return pseudo;
    }
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Skill getMainSkill() {
        return mainSkill;
    }
    public void setMainSkill(Skill mainSkill) {
        this.mainSkill = mainSkill;
    }
}
