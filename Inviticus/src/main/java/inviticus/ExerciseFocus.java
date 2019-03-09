/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inviticus;

/**
 * 
 * @author Benjamin
 */
public class ExerciseFocus {
    
    private String name;
    private String exerciseType;
    private boolean isPrimarilyOutdoors;
    
    public ExerciseFocus()
    {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExerciseType() {
        return exerciseType;
    }

    public void setExerciseType(String exerciseType) {
        this.exerciseType = exerciseType;
    }

    public boolean isIsPrimarilyOutdoors() {
        return isPrimarilyOutdoors;
    }

    public void setIsPrimarilyOutdoors(boolean isPrimarilyOutdoors) {
        this.isPrimarilyOutdoors = isPrimarilyOutdoors;
    }
    
    
}
