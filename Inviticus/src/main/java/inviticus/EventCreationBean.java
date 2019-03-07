/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inviticus;

/**
 *
 * @author martinezb3
 */
public class EventCreationBean {
    
    private Event event;
    
    public EventCreationBean(Event event)
    {
        //Without a better understanding of how the JS will talk to Java, I think we should leave these classes kind of vague.
    }
    
    public void createEvent()
    {
        //Perform validation checks on event
            //all validations could honestly possibly go in another class within this package that contains all of the methods
            //for validation. 
        
        //if team does not exist already in the DB, and validation checks are passed,
            //add team to DB
    }
    
    public Event deleteEvent()
    {
        
    }
}

