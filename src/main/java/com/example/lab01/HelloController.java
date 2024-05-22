package com.example.lab01;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void send() {
        welcomeText.setText("Welcome LAB01!");
    }
}