package com.github.vipulkumarsinghtech.developertoolbox;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.util.UUID;

public class UuidGeneratorController {

    @FXML
    private TextArea uuid;

    @FXML
    private void generateUuid() {
        uuid.setText(UUID.randomUUID().toString());
    }

}