/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inviticus;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import sqlConsole.SQLConnector;

/**
 * This class tests the logic for the account.
 * Checks for:
 *  Syntax of username, if one already exists, 5 letters minimum store in database
 *  Syntax of email, if it's valid, store in database
 *  Syntax of password, minimum length, at least one uppercase letter
 *  Age above 16
 * @author Karl
 * @author Ben
 */
public class AccountCreationBean{
    
    private Account newAccount;
    private boolean isUpperCase = Character.isUpperCase(0);
    
    public AccountCreationBean(Account newAccount) {
        this.newAccount = newAccount;
    }
    
    public void main(String[] args) {
        checkAccount();
    }
    
    public void checkAccount(){
        boolean passed = false;
        if(!verifyUsername())
            // if failed, give user feedback
        if(verifyEmail())
            // if failed, give user feedback
        if(verifyPassword())
            // if failed, give user feedback
        if(verifyAge())
            // if failed, give user feedback
        if(passed == true) {
            SQLConnector connector = new SQLConnector();
            connector.updateUserTable(newAccount);
            connector.close();
        }
            
    }
    
    /**
     * Username needs to be at least 6 letters
     */
    public boolean verifyUsername() {
        if(newAccount.getUsername().length() < 6)
            return false;
        
        SQLConnector connector = new SQLConnector();
        boolean exists = connector.existsInDatabase(newAccount.getUsername(), "username", "Users");
        if(!exists)
            return false;
        connector.close();
        
        return true;
    }
    
    /**
     * Checks to see if the email is a valid email
     */
    public boolean verifyEmail() {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
        
        Pattern pat = Pattern.compile(emailRegex);
        if(newAccount.getEmail() == null)
            return false;
        
        SQLConnector connector = new SQLConnector();
        boolean exists = connector.existsInDatabase(newAccount.getEmail(), "email", "Users");
        if(!exists)
            return false;
        connector.close();
        // before this return I need to see if the email exists
        
        return true;
    }
    
    /**
     * Minimum length should be 6 with at least 1 uppercase letter
     */
    public boolean verifyPassword() {
        if(newAccount.getPassword().length() < 6)
            return false;
        
        boolean upperCaseFlag = false;
        for(int i = 0; i < newAccount.getPassword().length(); i++) {
            Character ch = newAccount.getPassword().charAt(i);
            if(Character.isUpperCase(ch))
                upperCaseFlag = true;
        }
        
        if(upperCaseFlag == false)
            return false;
        
        return true;
    }
    
    /**
     * A user must be at least 16 years old
     */
    public boolean verifyAge() {
        if(newAccount.getAge() < 16)
            return false;
        
        return true;
    }
}
