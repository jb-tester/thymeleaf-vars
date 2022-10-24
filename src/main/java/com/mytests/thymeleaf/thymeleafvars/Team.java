package com.mytests.thymeleaf.thymeleafvars;

import java.util.List;

/**
 * *
 * <p>Created by irina on 10/24/2022.</p>
 * <p>Project: thymeleaf-vars</p>
 * *
 */
public class Team {

    String team_name;
    List<User> members;

    public Team(String team_name, List<User> members) {
        this.team_name = team_name;
        this.members = members;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    public List<User> getMembers() {
        return members;
    }

    public void setMembers(List<User> members) {
        this.members = members;
    }
}
