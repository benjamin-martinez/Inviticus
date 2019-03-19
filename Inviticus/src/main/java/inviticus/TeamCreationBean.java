/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inviticus;


import sqlConsole.SQLConnector;

/**
 * @author karl cebulski
 * @author martinezb3
 */
public class TeamCreationBean {
    
    private Team team;
    
    public TeamCreationBean(Team team)
    {
        this.team = team;
    }
    
    public void createTeam()
    {
        //Perform validation checks on team
            //Here, the validation checks could possibly consist of validating the
            //location. This might not be necessary, as the location input might come in the form of 
            //a drop down menu where options would be limited.
        
            //An actual legitamite validation would be the name of the team. If the team name is considered 
            //to be vulgar, team creation should be denied until an acceptable name is selected.
        
        //if team does not exist already in the DB, and validation checks are passed,
            //add team to DB
        
        SQLConnector connector = new SQLConnector();
        boolean exists = connector.existsInDatabase(team.getName(),
                        "team", "Team");
        if(exists == true)
            // Give user choice to rename team or what ever else needs to be changed
            throw new IllegalArgumentException("Team Name already exists.");
        else {
            connector.updateTeamTable(team);
        }
        connector.close();
    }
    
    public void deleteTeam(){
        SQLConnector connector = new SQLConnector();
        try {
        connector.deleteTeam(team);
        }
        catch(NullPointerException npe) {
            
        }
        connector.close();
    }
    
}

