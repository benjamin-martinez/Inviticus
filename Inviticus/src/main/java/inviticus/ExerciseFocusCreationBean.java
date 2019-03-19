/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inviticus;

import sqlConsole.SQLConnector;

/**
 *
 * @author Karl
 */
public class ExerciseFocusCreationBean {
    
    private ExerciseFocus newFocus;
    
    
    public ExerciseFocusCreationBean(ExerciseFocus newFocus) {
        this.newFocus = newFocus;
    }
    
    
    public void createFocus() {
        SQLConnector connector = new SQLConnector();
        boolean exists = connector.existsInDatabase(newFocus.getName(), "exercisefocus", "Team");
        if(exists == true)
            // Give user choice to rename event or what ever else needs to be changed
            throw new IllegalArgumentException("Exercise already exists.");
        
        else {
            connector.updateExerciseFociTable(newFocus);
        }
        connector.close();
    }
    
    
    public void deleteFocus() {
        SQLConnector connector = new SQLConnector();
        connector.deleteExerciseFocus(newFocus);
        connector.close();
    }
}
