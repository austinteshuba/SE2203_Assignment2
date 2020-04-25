// Austin Teshuba
// iCLINICController.java
// This file handled on screen events in the iCLINIC system

package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.MenuItem;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class iCLINICController {

    // variable for the About Us MenuItem
    @FXML
    public MenuItem aboutUs;

    // Event handler for clicking the About Us MenuItem
    @FXML
    private void handleAboutUsAlert(ActionEvent event) {
        // Declare an OK button to add to alert
        ButtonType okayButton = new ButtonType("OK");

        // Create alert with correct title and text
        Alert aboutUsAlert = new Alert(AlertType.NONE);
        aboutUsAlert.setTitle("About Us");

        aboutUsAlert.setContentText(" iCLINIC \n Copyright @2020 Se2203b \n Austin Teshuba");

        // Add the button
        aboutUsAlert.getButtonTypes().addAll(okayButton);

        // Show the alert and store the response.
        Optional<ButtonType> buttonPressed = aboutUsAlert.showAndWait();

        // If the ok button was pressed, close the window.
        if (buttonPressed.isPresent() && buttonPressed.get() == okayButton) {
            aboutUsAlert.close();
        }

    }
}
