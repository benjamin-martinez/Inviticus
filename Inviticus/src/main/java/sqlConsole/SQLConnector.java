/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlConsole;

import inviticus.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Benjamin
 */
public class SQLConnector {
    
    private Connection connection;
    private boolean isConnectionOpen;
    
    public SQLConnector()
    {
        connect();
    }
    
    public void connect()
    {
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
            // line below needs to be modified to include the database name, user, and password (if any)
            connection = DriverManager.getConnection("jdbc:sqlserver://inviticus-server.database.windows.net:1433;database=" +
                    "Inviticus;user=inviticus@inviticus-server;password={point0One};encrypt=true;" +
                    "trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;");
  
            System.out.println("Connected to database !");
        }
        catch(SQLException sqle) {
            System.out.println("Sql Exception :"+sqle.getMessage());
        }
        catch(ClassNotFoundException e) {
            System.out.println("Class Not Found Exception :" + e.getMessage());
        }
    }
    
    public boolean existsInDatabase(String fieldName, String columnName, String tableName)
    {
        boolean found = false;
        
        if(!isConnectionOpen)
        {
            //found = false;
        }
        else
        {
            try {
            PreparedStatement prepStatement = connection.prepareStatement("SELECT " + columnName + " FROM " + tableName + " WHERE " +
                    columnName + "= " + fieldName);
 
            ResultSet resObj = prepStatement.executeQuery();
            while(resObj.next()) {
                found = true;
            }
            }   catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }
        }
        return found;
    }
    
    public void updateUserTable(Account account)
    {
        if(!isConnectionOpen)
        {
            
        }
        else
        {
            try {
                PreparedStatement prepStatement = connection.prepareStatement("INSERT INTO Users " + 
                        "(username, password, email, first_name, last_name, age, city, state, country, " +
                        "exercise_focus1, exercise_focus2, exercise_focus3, " +
                        "affiliated_team1, affiliated_team2, affiliated_team3)" +
                        " values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
                prepStatement.setString(1, account.getUsername());
                prepStatement.setString(2, account.getPassword());
                prepStatement.setString(3, account.getEmail());
                prepStatement.setString(4, account.getFirstName());
                prepStatement.setString(5, account.getLastName());
                prepStatement.setInt(6, account.getAge());
                prepStatement.setString(7, account.getCity());
                prepStatement.setString(8, account.getState());
                prepStatement.setString(9, account.getCountry());
                prepStatement.setString(10, account.getExerciseFoci().get(0).getName());
                prepStatement.setString(11, account.getExerciseFoci().get(1).getName());
                prepStatement.setString(12, account.getExerciseFoci().get(2).getName());
                prepStatement.setString(13, account.getTeamAffiliations().get(0).getName());
                prepStatement.setString(14, account.getTeamAffiliations().get(1).getName());
                prepStatement.setString(15, account.getTeamAffiliations().get(2).getName());
 
                //ResultSet resObj = prepStatement.executeQuery();
                prepStatement.executeQuery();
                
            }   
            catch (Exception sqlException) {
            sqlException.printStackTrace();
            }
        }
    }
    
    public void deleteUser(Account account)
    {
        if(!isConnectionOpen)
        {
            
        }
        else
        {
            try {
                PreparedStatement prepStatement = connection.prepareStatement("DELETE FROM Users WHERE username=?");
                prepStatement.setString(1, account.getUsername());
 
                //ResultSet resObj = prepStatement.executeQuery();
                prepStatement.executeQuery();
                
            }   
            catch (Exception sqlException) {
            sqlException.printStackTrace();
            }
        }
    }
    
    public void updateTeamTable(Team team)
    {
        if(!isConnectionOpen)
        {
            
        }
        else
        {
            try {
                PreparedStatement prepStatement = connection.prepareStatement("INSERT INTO Teams " + 
                        "(name, city, state, country, admin1, admin2, admin3, " +
                        "exercise_focus1, exercise_focus2, exercise_focus3)" +
                        " values(?,?,?,?,?,?,?,?,?,?);");
                prepStatement.setString(1, team.getName());
                prepStatement.setString(2, team.getCity());
                prepStatement.setString(3, team.getState());
                prepStatement.setString(4, team.getCountry());
                prepStatement.setString(5, team.getAdmins().get(0).getUsername());
                prepStatement.setString(6, team.getAdmins().get(1).getUsername());
                prepStatement.setString(7, team.getAdmins().get(2).getUsername());
                prepStatement.setString(8, team.getExerciseFoci().get(0).getName());
                prepStatement.setString(9, team.getExerciseFoci().get(1).getName());
                prepStatement.setString(10, team.getExerciseFoci().get(2).getName());
 
                //ResultSet resObj = prepStatement.executeQuery();
                prepStatement.executeQuery();
                
            }   
            catch (Exception sqlException) {
            sqlException.printStackTrace();
            }
        }
    }
    
    public void deleteTeam(Team team)
    {
        if(!isConnectionOpen)
        {
            
        }
        else
        {
            try {
                PreparedStatement prepStatement = connection.prepareStatement("DELETE FROM Teams WHERE name=?");
                prepStatement.setString(1, team.getName());
 
                //ResultSet resObj = prepStatement.executeQuery();
                prepStatement.executeQuery();
                
            }   
            catch (Exception sqlException) {
            sqlException.printStackTrace();
            }
        }
    }
    
    public void updateEventTable(Event event)
    {
        if(!isConnectionOpen)
        {
            
        }
        else
        {
            try {
                PreparedStatement prepStatement = connection.prepareStatement("INSERT INTO Teams " + 
                        "(name, time, exercise_focus, venue, city, state, country)" +
                        " values(?,?,?,?,?,?,?);");
                prepStatement.setString(1, event.getName());
                prepStatement.setTimestamp(2, event.getTime());
                prepStatement.setString(3, event.getExerciseFocus().getName());
                prepStatement.setString(4, event.getVenue());
                prepStatement.setString(5, event.getCity());
                prepStatement.setString(6, event.getState());
                prepStatement.setString(7, event.getCountry());
 
                //ResultSet resObj = prepStatement.executeQuery();
                prepStatement.executeQuery();
                
            }   
            catch (Exception sqlException) {
            sqlException.printStackTrace();
            }
        }
    }
    
    public void deleteEvent(Event event)
    {
        if(!isConnectionOpen)
        {
            
        }
        else
        {
            try {
                PreparedStatement prepStatement = connection.prepareStatement("DELETE FROM Events WHERE name=?");
                prepStatement.setString(1, event.getName());
 
                //ResultSet resObj = prepStatement.executeQuery();
                prepStatement.executeQuery();
                
            }   
            catch (Exception sqlException) {
            sqlException.printStackTrace();
            }
        }
    }
    
    public void updateExerciseFociTable(ExerciseFocus exerciseFocus)
    {
        if(!isConnectionOpen)
        {
            
        }
        else
        {
            try {
                PreparedStatement prepStatement = connection.prepareStatement("INSERT INTO ExerciseFoci " + 
                        "(name, exercise_type, primarily_outdoors)" +
                        " values(?,?,?);");
                prepStatement.setString(1, exerciseFocus.getName());
                prepStatement.setString(2, exerciseFocus.getExerciseType());
                prepStatement.setBoolean(3, exerciseFocus.isIsPrimarilyOutdoors());
 
                //ResultSet resObj = prepStatement.executeQuery();
                prepStatement.executeQuery();
                
            }   
            catch (Exception sqlException) {
            sqlException.printStackTrace();
            }
        }
    }
    
    public void deleteExerciseFocus(ExerciseFocus exerciseFocus)
    {
        if(!isConnectionOpen)
        {
            
        }
        else
        {
            try {
                PreparedStatement prepStatement = connection.prepareStatement("DELETE FROM ExerciseFocus WHERE name=?");
                prepStatement.setString(1, exerciseFocus.getName());
 
                //ResultSet resObj = prepStatement.executeQuery();
                prepStatement.executeQuery();
                
            }   
            catch (Exception sqlException) {
            sqlException.printStackTrace();
            }
        }
    }
    
    public Connection getConnection()
    {
        return connection;
    }
    
    public void close()
    {
        try{
        connection.close();
        }
        catch(Exception sqlExcpetion){
            
        }
    }
}
