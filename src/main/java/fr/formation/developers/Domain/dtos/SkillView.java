package fr.formation.developers.Domain.dtos;

public class SkillView {
    private String name ;

    public SkillView () {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){return "Skill view [name : " + name + "]";}

}
