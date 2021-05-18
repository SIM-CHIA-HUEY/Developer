package fr.formation.developers.domain.dtos;

import javax.validation.constraints.*;
import java.time.LocalDate;

public class ProjectCreate {

    @NotBlank(message = "Team name is mandatory") @Size(min = 1, max = 255) private String name;
    @NotBlank(message = "Team name is mandatory") @Size(min = 10, max = 1000) private String description;
    @NotNull @FutureOrPresent private LocalDate startDate;
    private Long budget ;

    ProjectCreate (){}

    public ProjectCreate(String name, String description){
        this.name = name;
        this.description = description;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setBudget(Long budget) {
        this.budget = budget;
    }
    public Long getBudget() {
        return budget;
    }

    @Override
    public String toString() {
        return "Project [name=" + name + ", description=" + description
                + ", startDate=" + startDate + ", budget=" + budget + "]";
    }
}
