package fr.formation.developers.domain.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class TeamCreate {
    // @NotBlank : espace not OK ; NotNull : espace OK ;
    @NotBlank(message = "Team name is mandatory")
    @Size(min = 1, max = 255)
    private String teamName; // les annotations agissent que sur ce champ d'input
    @NotNull private boolean agile ;

    public TeamCreate (){
    }

    public TeamCreate(String teamName, boolean agile) {
        this.teamName = teamName;
        this.agile = agile;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    //getter
    public boolean isAgile() {
        return agile;
    }

    public void setAgile(boolean agile) {
        this.agile = agile;
    }

    public String toString(){
        return "Team [Name: " + teamName + " ; Is it team agile ? :" + agile + "]";
    }




}
