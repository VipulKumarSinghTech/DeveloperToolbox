package com.github.vipulkumarsinghtech.developertoolbox;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;

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
        String encodedText = Base64.getEncoder().encodeToString(inputText.getBytes());
        encodeResult.setText(RESULT + encodedText);
    }

    @FXML
    private void decodeToBase64() {
        String inputText = decodeTextArea.getText();
        byte[] decodedBytes = Base64.getDecoder().decode(inputText.getBytes());
        String decodedText = new String(decodedBytes, StandardCharsets.UTF_8);
        decodeResult.setText(RESULT + decodedText);
    }

    @FXML
    private void copyEncodedResult() {
        copyResult(encodeResult.getText().replace(RESULT, ""));
    }

    @FXML
    private void copyDecodedResult() {
        copyResult(decodeResult.getText().replace(RESULT, ""));
    }

    private void copyResult(String result) {
        Clipboard clipboard = Clipboard.getSystemClipboard();
        ClipboardContent content = new ClipboardContent();
        content.putString(result);
        clipboard.setContent(content);
    }
}
