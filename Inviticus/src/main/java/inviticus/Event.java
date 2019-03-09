/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inviticus;

import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author martinezb3
 */
public class Event {
    
    private String name;
    private Timestamp time;
    private ArrayList<Account> attendees;
    private ExerciseFocus exerciseFocus;
    private String venue;
    private String city;
    private String state;
    private String country;

    public Event()
    {
        
    }
    
    public String getName() {
        return name;
    }

    public Timestamp getTime() {
        return time;
    }

    public ExerciseFocus getExerciseFocus() {
        return exerciseFocus;
    }
    
    public ArrayList<Account> getAttendees() {
        return attendees;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public void setExerciseFocus(ExerciseFocus exerciseFocus) {
        this.exerciseFocus = exerciseFocus;
    }
    
    public void setAttendees(){
        this.attendees = attendees;
    }
    
    public void addAttendee(Account account) {
        attendees.add(account);
    }
    
    public void removeAttendee(Account account) {
        attendees.remove(account);
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
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
    
    
    
}
