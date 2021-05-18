package fr.formation.developers.domain.dtos;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class ProjectUpdate {
    @NotBlank(message = "Team name is mandatory") @Size(min = 10, max = 1000) private String description;
    private Long budget ;

    public ProjectUpdate(){}

    public String description(){
        return description;
    }
    public void setDescription (String description){
        this.description = description; }

    @Override
    public String toString() { return "ProjectUpdate [description=" + description + "]";}
}
