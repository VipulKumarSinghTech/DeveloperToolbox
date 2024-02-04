package com.github.vipulkumarsinghtech.developertoolbox;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonFormatController {

    @FXML
    private TextArea rawJson;

    @FXML
    private TextArea prettyJson;

    @FXML
    private void formatJson() {
        String inputJson = rawJson.getText().trim();
        if (!inputJson.isEmpty()) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            try {
                Object json = gson.fromJson(inputJson, Object.class);
                String formattedJson = gson.toJson(json);
                prettyJson.setMaxHeight(Double.MAX_VALUE);
                prettyJson.setText(formattedJson);
            } catch (Exception e) {
                prettyJson.setText("Invalid JSON format!");
            }
        } else {
            prettyJson.setText("Please enter JSON text!");
        }
    }

}
