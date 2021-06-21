package sample;

import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

// just add the functionality to be removed from the tab Vbox when called on the object.
public class taskField extends TextField {
    public void remove(VBox vbox) {
        vbox.getChildren().remove(this);
    }
}
