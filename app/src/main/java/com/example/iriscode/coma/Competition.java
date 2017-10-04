package com.example.iriscode.coma;

/**
 * Created by IRISCODE on 04/10/2017.
 */

public class Competition {

    private String competitionName;
    private String date;
    private String description;

    public Competition(String competitionName, String date, String description) {
        this.competitionName = competitionName;
        this.date = date;
        this.description = description;
    }

    public String getCompetitionName() {
        return competitionName;
    }

    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
