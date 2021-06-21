package sample;

import javafx.animation.TranslateTransition;
import javafx.scene.Group;
import javafx.util.Duration;

public class ProjectsMenu extends Group {
    // Attributes for the ProjectsMenu Class

    // used to check if the app have been launched or not
    private Boolean firstLaunch;
    // Used to check if the menu is being shown or not
    private Boolean shown;
    // This is an object that is used to move an object to a location in the gui
    private TranslateTransition move = new TranslateTransition();

    // Methods for the ProjectsMenu Class

    // When an object is constructed, the move object will have the anim duration of 500 mils and the node that it is pointing to the object instance of this class
    public ProjectsMenu() {
        super();
        shown = false;
        firstLaunch = true;
        move.setDuration(Duration.millis(300));
        move.setNode(this);
    }
    // Called to change the shown attribute
    public void menuClick() {shown = !shown;}
    // Used to get the value of the shown variable
    public Boolean getState() {return shown;}
    // used to get the value of firstLaunch
    public Boolean getFirstLaunch() {return firstLaunch;}
    // used to set a new value for firstLaunch
    public void setFirstLaunch(Boolean bool) {firstLaunch = bool;}
    // called to move the object to the right
    public void show() {
        move.setToX(250);
        move.play();
    }
    // called to move the object back to the left
    public void unshow() {
        move.setToX(0);
        move.play();
    }
}
