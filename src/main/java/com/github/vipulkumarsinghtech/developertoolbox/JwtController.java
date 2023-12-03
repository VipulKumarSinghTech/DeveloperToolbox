package com.github.vipulkumarsinghtech.developertoolbox;

import com.github.vipulkumarsinghtech.developertoolbox.utils.ApplicationUtils;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.time.Instant;
import java.util.Date;

public class JwtController {

    @FXML
    private TextArea epochTime;

    @FXML
    private Label dateTimeResult;

    private static final String RESULT = "Result: ";

    @FXML
    private void convertToDateTime() {
        String inputText = epochTime.getText().trim();

        if (inputText.isEmpty() || !(inputText.matches("\\d+"))) {
            dateTimeResult.setText("Please enter a valid value");
            return;
        }

        String result = Date.from(Instant.ofEpochMilli(Long.parseLong(inputText))).toString();
        dateTimeResult.setText(RESULT + result);
    }

    @FXML
    private void copyDateTime() {
        ApplicationUtils.copyToClipboard(dateTimeResult.getText().replace(RESULT, ""));
    }

}
