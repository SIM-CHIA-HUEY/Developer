package fr.formation.developers.domain.dtos;


import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class ProjectDelete {
    @NotNull String projectName;
    @NotNull @Future private LocalDate endDate;

    ProjectDelete(){}

    public ProjectDelete(String projectName){
        this.projectName = projectName ;
    }


    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString (){
        return "You successfully closed project " + projectName;
    }
}
