/**
 * This class is used to setup and retrieve names, usernames, email's, and passwords
 * entered by a user.
 * Then we would have to verify the information to the database.
 * Checking to see if an email has already signed up, a username has been taken.
 * Later we will implement password restrictions
 */
package inviticus;

/**
 *
 * @author Benjamin
 * @co-author Karl
 */
public class Account {
    
     private String username, email, password, firstName, lastName;
     private int age, id;
    
    public Account(String username, String email, String password, String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
        this.password = password;
        this.age = age;
    }

    public int getId() {
        return id;
    }
    
    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void setId(int id) {
        this.id = id;
    }
}