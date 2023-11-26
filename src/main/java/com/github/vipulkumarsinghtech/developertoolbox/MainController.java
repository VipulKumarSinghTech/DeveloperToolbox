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
        loadScene("base64-view.fxml", "base64-view.css");
    }

    public void loadScene2() {
        loadScene("scene2.fxml", "scene2.css");
    }

    public void exitApplication() {
        Stage stage = (Stage) contentPane.getScene().getWindow();
        stage.close();
    }

    private void loadScene(String fxmlFileName, String cssFileName) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFileName));
            Parent scene = loader.load();

            String css = this.getClass().getResource(cssFileName).toExternalForm();
            scene.getStylesheets().add(css);

            Stage stage = (Stage) contentPane.getScene().getWindow();
            stage.setMaximized(true);
            contentPane.getChildren().setAll(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
