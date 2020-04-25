// Austin Teshuba
// Main.java
// This file sets up the iCLINIC window

package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        // Load the fxml
        Parent root = FXMLLoader.load(getClass().getResource("iCLINIC.fxml"));
        // set the title, window size, icon, and remove resizability.
        primaryStage.setTitle("iCLINIC");
        primaryStage.setScene(new Scene(root, 756, 580));
        primaryStage.setResizable(false);
        primaryStage.getIcons().add(new Image("sample/WesternLogo.png"));
        // Show the stage
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
