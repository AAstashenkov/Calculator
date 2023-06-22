package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class Controller {
    public TextField expression;

    public void showOne(ActionEvent actionEvent) {
        expression.setText("1");
    }
    public void showTwo(ActionEvent actionEvent) {
        expression.setText("2");
    }
    public void showThree(ActionEvent actionEvent) {
        expression.setText("3");
    }
    public void showFour(ActionEvent actionEvent) {
        expression.setText("4");
    }
    public void showFive(ActionEvent actionEvent) {
        expression.setText("5");
    }
    public void showSix(ActionEvent actionEvent) {
        expression.setText("6");
    }
    public void showSeven(ActionEvent actionEvent) {
        expression.setText("7");
    }
    public void showEight(ActionEvent actionEvent) {
        expression.setText("8");
    }
    public void showNine(ActionEvent actionEvent) {
        expression.setText("9");
    }
    public void showZero(ActionEvent actionEvent) {
        expression.setText("0");
    }
    public void clear(ActionEvent actionEvent) {
        expression.setText("");
    }
}