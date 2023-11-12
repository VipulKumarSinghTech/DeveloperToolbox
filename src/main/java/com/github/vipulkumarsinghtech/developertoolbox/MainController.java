package com.github.vipulkumarsinghtech.developertoolbox;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainController {

    @FXML
    private VBox contentPane;

    public void loadScene1() {
        loadScene("scene1.fxml", "Scene 1");
    }

    public void loadScene2() {
        loadScene("scene2.fxml", "Scene 2");
    }

    //public void exitApplication() {
       // Stage stage = (Stage) contentPane.getScene().getWindow();
        //stage.close();
   // }

    private void loadScene(String fxmlFileName, String title) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFileName));
            Parent scene = loader.load();
            Stage stage = (Stage) contentPane.getScene().getWindow();
            stage.setTitle(title);
            contentPane.getChildren().setAll(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
