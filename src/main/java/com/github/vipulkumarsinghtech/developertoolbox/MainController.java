package com.github.vipulkumarsinghtech.developertoolbox;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Objects;

public class MainController {

    @FXML
    private VBox contentPane;

    public void loadScene1() {
        loadScene("base64-view.fxml", "base64-view.css");
    }

    public void loadScene2() {
        loadScene("epoch-view.fxml", "epoch-view.css");
    }

    public void loadScene3() {
        loadScene("jwt-view.fxml", "jwt-view.css");
    }

    public void loadScene4() {
        loadScene("uuid-generator.fxml", "uuid-generator.css");
    }

    public void exitApplication() {
        Stage stage = (Stage) contentPane.getScene().getWindow();
        stage.close();
    }

    private void loadScene(String fxmlFileName, String cssFileName) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFileName));
            Parent scene = loader.load();

            String css = Objects.requireNonNull(this.getClass().getResource(cssFileName)).toExternalForm();
            scene.getStylesheets().add(css);

            Stage stage = (Stage) contentPane.getScene().getWindow();
            stage.setMaximized(true);
            contentPane.getChildren().setAll(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
