package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.Optional;

public class Controller {
    @FXML
    private Button drag = new Button();
    @FXML
    private Button exit = new Button();
    @FXML
    private Button minimize = new Button();
    @FXML
    private ProjectsMenu projectsMenu = new ProjectsMenu();
    @FXML
    public VBox projectMenuVBox = new VBox();
    @FXML
    private TabPane mainTab = new TabPane();
    public static VBox curVBox;

    public void slide() {
        // gets the state of the projectMenu whether if it is shown or not
        Boolean state = projectsMenu.getState();
        // if it is shown then un-show the menu
        if (state) {
            projectsMenu.unshow();
        }
        // if it is not shown then show the menu
        else {
            projectsMenu.show();
        }
        // gets called so the state variable change based on the conditions
        projectsMenu.menuClick();
        // gonna get called when the program was first launched since there isn't going to be any button in the menu
        if (projectsMenu.getFirstLaunch()) {
            // make the firstLaunch attribute of the projectsMenu object to be false to signify that this program was already launched before
            projectsMenu.setFirstLaunch(false);
            // add a new button directly below the new project button.
            MenuButtons.addButton(projectMenuVBox, mainTab);
        }

    }
    public void drag() {
        // sets the functionality of being able to be drag to the window when the mouse entered the button area
        Stage stage = (Stage) drag.getScene().getWindow();
        drag.setOnMousePressed(pressEvent -> drag.setOnMouseDragged(dragEvent -> {
            stage.setX(dragEvent.getScreenX() - pressEvent.getSceneX());
            stage.setY(dragEvent.getScreenY() - pressEvent.getSceneY());
        }));
    }


    public void minimize() {
        // sets the minimize functionality to the minimize button
        Stage stage = (Stage) minimize.getScene().getWindow();
        stage.setIconified(true);
    }

    public void exit() {
        // sets the exit functionality to the exit button.
        Stage stage = (Stage) exit.getScene().getWindow();
        stage.close();
    }

    public void addTask() {
        // create a new instance of a taskField object and then adding it to the current active Vbox of the mainTab
        taskField text = new taskField();
        text.setFont(Font.font("Agency FB", 28));
        text.setOnKeyPressed(event ->  {
            if (event.getCode() == KeyCode.ALT) {
                text.remove(Controller.curVBox);
            }
        });
        TextInputDialog input = new TextInputDialog();
        input.setTitle("New Task");
        input.setHeaderText("Enter the new task name");
        input.setContentText("Task Name");
        Optional<String> result = input.showAndWait();
        TextField test = input.getEditor();
        if (test.getText() != null && test.getText().length() != 0) {
            text.setText(result.get());
            text.setStyle("-fx-background-color: transparent; -fx-text-fill: white");
            text.setPrefHeight(32);
            Controller.curVBox.getChildren().add(text);
        }
    }
}
