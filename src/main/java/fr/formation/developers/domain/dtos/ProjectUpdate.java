package fr.formation.developers.domain.dtos;

import javax.validation.constraints.*;

public class ProjectUpdate {
    @NotBlank(message = "Team name is mandatory") @Size(min = 10, max = 1000) private String description;
    @PositiveOrZero private Long budget ;
    private String name;

    public ProjectUpdate(){}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String description(){
        return description;
    }
    public void setDescription (String description){
        this.description = description; }

    public Long budget(){
        return budget;
    }
    public void setBudget(Long budget) {
        this.budget = budget;
    }

    @Override
    public String toString() { return "ProjectUpdate [description =" + description + ", budget =" + budget + "]";}
}
