package com.github.vipulkumarsinghtech.developertoolbox;

import com.github.vipulkumarsinghtech.developertoolbox.utils.ApplicationUtils;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64Controller {

    @FXML
    private TextArea encodeTextArea;

    @FXML
    private TextArea decodeTextArea;

    @FXML
    private Label encodeResult;

    @FXML
    private Label decodeResult;

    private static final String RESULT = "Result: ";

    @FXML
    private void encodeToBase64() {
        String inputText = encodeTextArea.getText();
        if (inputText.isEmpty())
            return;

        String encodedText = Base64.getEncoder().encodeToString(inputText.getBytes());
        encodeResult.setText(RESULT + encodedText);
    }

    @FXML
    private void decodeToBase64() {
        String inputText = decodeTextArea.getText();
        if (inputText.isEmpty())
            return;

        try {
            byte[] decodedBytes = Base64.getDecoder().decode(inputText.getBytes());
            String decodedText = new String(decodedBytes, StandardCharsets.UTF_8);
            decodeResult.setText(RESULT + decodedText);
        }catch (Exception e){
            //TODO logger
            decodeResult.setText("Invalid Base64 input");
        }
    }

    @FXML
    private void copyEncodedResult() {
        ApplicationUtils.copyToClipboard(encodeResult.getText().replace(RESULT, ""));
    }

    @FXML
    private void copyDecodedResult() {
        ApplicationUtils.copyToClipboard(decodeResult.getText().replace(RESULT, ""));
    }

}
