package com.github.vipulkumarsinghtech.developertoolbox;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.time.Instant;
import java.util.Base64;
import java.util.Date;

public class JwtController {

    @FXML
    private TextArea token;

    @FXML
    private TextArea header;

    @FXML
    private TextArea payload;

    @FXML
    private TextArea signature;

    @FXML
    private void decodeJwtToken() {
        String inputText = token.getText().trim();

        if(inputText.isEmpty())
            return;

        String[] chunks = inputText.split("\\.");

        Base64.Decoder decoder = Base64.getUrlDecoder();

        String headerChunk = new String(decoder.decode(chunks[0]));
        String payloadChunk = new String(decoder.decode(chunks[1]));

        header.setText(headerChunk);
        payload.setText(payloadChunk);
    }

}
