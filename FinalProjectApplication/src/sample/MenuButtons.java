package sample;

import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

import java.util.Optional;

public class MenuButtons extends Button {
    private Boolean itsnew;
    private Tab thisTab;
    private VBox thisVBox;
    public static int current = 0;

    // the constructor
    public MenuButtons() {
        super();
        MenuButtons.current++;
        itsnew = true;
    }

    public void clicked(VBox vbox, TabPane tabPane) {
        // when it is new (-New Project-)
        if (itsnew) {
            // asks the user to input the name of the project
            TextInputDialog input = new TextInputDialog();
            input.setTitle("New Project");
            input.setHeaderText("Enter the new project name");
            input.setContentText("Project name");
            Optional<String> result = input.showAndWait();
            TextField test = input.getEditor();
            // if it is a valid input then change the button text to the user input and then adding a new instance of MenuButton to the menu VBox
            if (test.getText() != null && test.getText().length() != 0) {
                this.setText(result.get());
                this.setStyle("-fx-background-color: transparent; -fx-text-fill: white; -fx-pref-height: 32px; -fx-pref-width: 215px;");
                itsnew = false;
                Tab tab = new Tab("project"+MenuButtons.current);
                VBox vb = new VBox();
                tab.setContent(vb);
                thisTab = tab;
                thisVBox = vb;
                tabPane.getTabs().add(tab);
                addButton(vbox, tabPane);
                tabPane.getStylesheets().add("invis.css");
                tabPane.getSelectionModel().select(tab);
                Controller.curVBox = vb;
            }
            // if it is not valid then continue the program
            else {
                System.out.println("returned an empty string");
            }
        }
        // if it is not new then change the current tab to the tab associated with this menuButton
        else {
            tabPane.getSelectionModel().select(thisTab);
            Controller.curVBox = thisVBox;
        }
    }

    // this is static method that could be called to make an instance of this object and adding it to the menuButtonVBox
    public static void addButton(VBox vbox, TabPane tabPane) {
        MenuButtons but = new MenuButtons();
        System.out.println(MenuButtons.current);
        but.setText("-New Project-");
        but.setStyle("-fx-background-color: transparent; -fx-text-fill: white; -fx-pref-height: 32px; -fx-pref-width: 215px;");
        but.setFont(Font.font("Agency FB", 28));
        // behaviour when the button is clicked by the mouse
        but.setOnMousePressed(event ->  {
            if (event.isPrimaryButtonDown()) {
                but.clicked(vbox, tabPane);
            }
            else if (event.isSecondaryButtonDown() && !but.getState()) {
                TextInputDialog input = new TextInputDialog();
                input.setTitle("Edit Project Name");
                input.setHeaderText("Enter the new project name");
                input.setContentText("New Project Name");
                Optional<String> result = input.showAndWait();
                TextField test = input.getEditor();
                if (test.getText() != null && test.getText().length() != 0) {
                    but.setText(result.get());
                    but.setStyle("-fx-background-color: transparent; -fx-text-fill: white; -fx-pref-height: 32px; -fx-pref-width: 215px;");
                }
            }
        });
        // behaviour when the button detects an input from the keyboard while the button is clicked
        but.setOnKeyPressed(event ->  {
            if (event.getCode() == KeyCode.ALT) {
                but.remove(vbox, tabPane);
            }
        });
        but.setOnMouseEntered(event -> but.setStyle("-fx-background-color: #f29007; -fx-text-fill: white; -fx-pref-height: 32px; -fx-pref-width: 215px;"));
        but.setOnMouseExited(event -> but.setStyle("-fx-background-color: transparent; -fx-text-fill: white; -fx-pref-height: 32px; -fx-pref-width: 215px;"));
        vbox.getChildren().add(but);
    }

    // used to get the private attribute itsnew
    public Boolean getState() {
        return itsnew;
    }

    // can be called to remove self from the menuButtonVBox
    public void remove(VBox vbox, TabPane tabPane) {
        if (!itsnew) {
            tabPane.getTabs().remove(thisTab);
            vbox.getChildren().remove(this);
        }
    }

}
