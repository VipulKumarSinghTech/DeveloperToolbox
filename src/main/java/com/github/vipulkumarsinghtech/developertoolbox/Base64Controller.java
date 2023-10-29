package com.github.vipulkumarsinghtech.developertoolbox;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.util.Base64;

public class Base64Controller {

    @FXML
    private TextArea inputTextArea;

    @FXML
    private Label resultLabel;

    @FXML
    private void encodeToBase64() {
        String inputText = inputTextArea.getText();
        String encodedText = Base64.getEncoder().encodeToString(inputText.getBytes());
        resultLabel.setText("Base64 Encoded: " + encodedText);
    }
}
