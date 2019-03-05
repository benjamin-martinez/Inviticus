/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountBean;


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
    
    public AccountCreationBean(Account newAccount) {
        this.newAccount = newAccount;
    }
    
    public void main(String[] args) {
        checkAccount();
    }
    
    public void checkAccount(){
        verifyUsername();
        verifyEmail();
        verifyPassword();
        verifyAge();
    }
    
    /**
     * Username needs to be at least 5 letters
     */
    public boolean verifyUsername() {
        return false;
    }
    
    /**
     * Checks to see if the email is a valid email
     */
    public boolean verifyEmail() {
        return false;
    }
    
    /**
     * Minimum length should be 6 with at least 1 uppercase letter
     */
    public boolean verifyPassword() {
        return false;
    }
    
    /**
     * A user must be at least 16 years old
     */
    public boolean verifyAge() {
        if(newAccount.getAge() < 16)
            return false;
        else 
            return true;
    }
}
