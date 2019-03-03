/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountBean;

import java.util.Scanner;

/**
 * This class tests the logic for the account.
 * Checks for:
 *  Syntax of username, if one already exists, 5 letters minimum store in database
 *  Syntax of email, if it's valid, store in database
 *  Syntax of password, minimum length, at least one uppercase letter
 *  Age above 16
 * @author Karl
 */
public class AccountCreationBean extends Account{
    
    public AccountCreationBean(String username, String email, String password, String fullname, int age) {
        super(username, email, password, fullname, age);
    }
    
    public void main(String[] args) {
        checkAccount();
    }
    
    public void checkAccount(){
        checkFullName();
        checkUsername();
        checkEmail();
        checkPassword();
        checkAge();
    }
    
    /**
     * Full Name needs to be at least 4 letters
     */
    public void checkFullName() {
        if(getmFullName() <= 4)
            
    }
    
    /**
     * Username needs to be at least 5 letters
     */
    public void checkUsername() {
        
    }
    
    /**
     * Checks to see if the email is a valid email
     */
    public void checkEmail() {
        
    }
    
    /**
     * Minimum length should be 6 with at least 1 uppercase letter
     */
    public void checkPassword() {
        
    }
    
    /**
     * A user must be at least 16 years old
     */
    public String checkAge() {
        if(getmAge() < 16)
            return "You must be at least 16 years or older.";
        
        else {
            return Integer.toString(getmAge());
        }
    }
}
