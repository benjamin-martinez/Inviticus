Event
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inviticus;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author martinezb3
 */
public class Event {
    
    private String name;
    private Date time;
    private ArrayList<Account> attendees;
    private String activity;
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

    public Date getTime() {
        return time;
    }

    public String getActivity() {
        return activity;
    }
    
    public ArrayList<Account> getAttendees() {
        return attendees;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }
    
    public void setAttendees(){
        this.attendees = attendees;
    }
    
    public void addAttendee(Account account) {
        attendees.add(account);
    }
    
    public Account removeAttendee(Account account) {
        return attendees.remove(account);
    }
    
}
