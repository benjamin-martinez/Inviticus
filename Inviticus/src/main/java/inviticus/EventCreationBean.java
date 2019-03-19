/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inviticus;

import com.sun.media.jfxmedia.events.NewFrameEvent;
import sqlConsole.SQLConnector;
import sun.awt.dnd.SunDragSourceContextPeer;

/**
 *
 * @author martinezb3
 */
public class EventCreationBean {
    
    private Event newEvent;
    
    public EventCreationBean(Event newEvent)
    {
        this.newEvent = newEvent;
        //Without a better understanding of how the JS will talk to Java, I think we should leave these classes kind of vague.
    }
    
    
    public void createEvent()
    {
        //Perform validation checks on event
            //all validations could honestly possibly go in another class within this package that contains all of the methods
            //for validation. 
        SQLConnector connector = new SQLConnector();
        boolean exists = connector.existsInDatabase(newEvent.getName(), "event", "Team");
        if(exists == true)
            // Give user choice to rename event or what ever else needs to be changed
            throw new IllegalArgumentException("Event already exists.");
        
        else {
            connector.updateEventTable(newEvent);
        }
        connector.close();
        //if event does not exist already in the DB, and validation checks are passed,
            //add event to DB
        
        
    }
    
    public void deleteEvent()
    {
        SQLConnector connector = new SQLConnector();
        connector.deleteEvent(newEvent);
        connector.close();
    }
}

