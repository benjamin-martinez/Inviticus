/**
 * This class is used to setup and retrieve names, usernames, email's, and passwords
 * entered by a user.
 * Then we would have to verify the information to the database.
 * Checking to see if an email has already signed up, a username has been taken.
 * Later we will implement password restrictions
 */
package accountBean;

/**
 *
 * @author Benjamin
 * @co-author Karl
 */
public class Account {
    
     private String mUsername, mEmail, mPassword, mFullName;
     private int mAge;
    
    public Account(String username, String email, String password, String fullname, int age) {
        this.mFullName = fullname;
        this.mUsername = username;
        this.mEmail = email;
        this.mPassword = password;
        this.mAge = age;
    }

    public String getmUsername() {
        return mUsername;
    }

    public String getmEmail() {
        return mEmail;
    }

    public String getmPassword() {
        return mPassword;
    }
    
    public String getmFullName() {
        return mFullName;
    }

    public int getmAge() {
        return mAge;
    }

    public void setmUsername(String mUsername) {
        this.mUsername = mUsername;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    public void setmPassword(String mPassword) {
        this.mPassword = mPassword;
    }

    public void setmFullName(String mFullName) {
        this.mFullName = mFullName;
    }

    public void setmAge(int mAge) {
        this.mAge = mAge;
    }
    
    
}
