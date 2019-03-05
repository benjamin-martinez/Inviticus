/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlConsole;

import accountBean.Account;
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
    
    public boolean searchDatabase(String fieldName, String columnName, String tableName)
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
            }   catch (Exception sqlException) {
                sqlException.printStackTrace();
            }
        }
        return found;
    }
    
    public void updateUserTable(Account account)
    {
        boolean found = false;
        if(!isConnectionOpen)
        {
            
        }
        else
        {
            try {
            PreparedStatement prepStatement = connection.prepareStatement("INSERT INTO Users ( )");
            prepStatement.setString(1, fieldName);
 
            ResultSet resObj = prepStatement.executeQuery();
            while(resObj.next()) {
                System.out.println("Loan Type?= " + resObj.getString("loan_type"));
            }
            }   catch (Exception sqlException) {
            sqlException.printStackTrace();
            }
        }
    }
    
    public void updateTeamTable()
    {
        boolean found = false;
        if(!isConnectionOpen)
        {
            
        }
        else
        {
            try {
            PreparedStatement prepStatement = connection.prepareStatement("SELECT " + columnName + " FROM " + tableName + " WHERE =?");
            prepStatement.setString(1, fieldName);
 
            ResultSet resObj = prepStatement.executeQuery();
            while(resObj.next()) {
                System.out.println("Loan Type?= " + resObj.getString("loan_type"));
            }
            }   catch (Exception sqlException) {
            sqlException.printStackTrace();
            }
        }
    }
    
    public void updateEventTable()
    {
        boolean found = false;
        if(!isConnectionOpen)
        {
            
        }
        else
        {
            try {
            PreparedStatement prepStatement = connection.prepareStatement("SELECT " + columnName + " FROM " + tableName + " WHERE =?");
            prepStatement.setString(1, fieldName);
 
            ResultSet resObj = prepStatement.executeQuery();
            while(resObj.next()) {
                System.out.println("Loan Type?= " + resObj.getString("loan_type"));
            }
            }   catch (Exception sqlException) {
            sqlException.printStackTrace();
            }
        }
    }
    
    public Connection getConnection()
    {
        return connection;
    }
}
