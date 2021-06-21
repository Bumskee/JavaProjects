package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage stage = new Stage();
        // set root1 to be a node containing the config on the fxml files
        Parent root1 = FXMLLoader.load(getClass().getResource("Program.fxml"));

        // title of the application
        stage.setTitle("Hund");

        // sets all of the configuration that we used in the scene to as the stage.
        stage.setScene(new Scene(root1));

        // style the window to not have the traditional controls.
        stage.initStyle(StageStyle.TRANSPARENT);

        //used to set an icon to the application in the taskbar?
        stage.getIcons().add(new Image("assets/images/icon.png"));

        // Used to launch the window.
        stage.show();
    }
}
