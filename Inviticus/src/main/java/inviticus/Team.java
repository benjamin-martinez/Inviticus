/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inviticus;

import java.util.ArrayList;

/**
 *
 * @author martinezb3
 */
public class Team {
    
    private String name;
    private String city;
    private String state;
    private String country;
    private ArrayList<Account> members;
    private ArrayList<Account> admins;
    private ArrayList<ExerciseFocus> exerciseFoci;

    public Team(){
        
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ArrayList<Account> getAdmins() {
        return admins;
    }

    public void setAdmins(ArrayList<Account> admins) {
        this.admins = admins;
    }

    public ArrayList<ExerciseFocus> getExerciseFoci() {
        return exerciseFoci;
    }

    public void setExerciseFoci(ArrayList<ExerciseFocus> exerciseFoci) {
        this.exerciseFoci = exerciseFoci;
    }
    
}

