package com.example.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class HelloController {
    private String command;

    @FXML
    private AnchorPane buttonPane;

    @FXML
    private Button clear;

    @FXML
    private Button divid;

    @FXML
    private Button eight;

    @FXML
    private Button equals;

    @FXML
    private Label field;

    @FXML
    private Button five;

    @FXML
    private Button four;

    @FXML
    private Button minus;

    @FXML
    private Button multiply;

    @FXML
    private Button nine;

    @FXML
    private Button nul;

    @FXML
    private Button one;

    @FXML
    private Button plus;

    @FXML
    private Label result;

    @FXML
    private Button seven;

    @FXML
    private Button six;

    @FXML
    private Button three;

    @FXML
    private Button two;

    @FXML
    private AnchorPane viewPane;


    @FXML
    void initialize() {
        command = "";
        one.setOnAction(x -> {
            command = command + "1";
            field.setText(command);
        });
        two.setOnAction(x -> {
            command = command + "2";
            field.setText(command);
        });
        three.setOnAction(x -> {
            command = command + "3";
            field.setText(command);
        });
        four.setOnAction(x -> {
            command = command + "4";
            field.setText(command);
        });
        five.setOnAction(x -> {
            command = command + "5";
            field.setText(command);
        });
        six.setOnAction(x -> {
            command = command + "6";
            field.setText(command);
        });
        seven.setOnAction(x -> {
            command = command + "7";
            field.setText(command);
        });
        eight.setOnAction(x -> {
            command = command + "8";
            field.setText(command);
        });
        nine.setOnAction(x -> {
            command = command + "9";
            field.setText(command);
        });
        nul.setOnAction(x -> {
            command = command + "0";
            field.setText(command);
        });
        plus.setOnAction(x -> {
            if (command.length() !=0) {
                if (command.charAt(command.length() - 1) != '-' && command.charAt(command.length() - 1) != '+' && command.charAt(command.length() - 1) != '*' &&
                        command.charAt(command.length() - 1) != '/') {
                    if (command.contains("+") || command.contains("-") || command.contains("*") || command.contains("/")) {
                        command = method() + "+";
                        field.setText(command);
                    } else {
                        command = command + "+";
                        field.setText(command);
                    }
                }
            }
        });
        minus.setOnAction(x -> {
            if (command.length() != 0) {
                if (command.charAt(command.length() - 1) != '-' && command.charAt(command.length() - 1) != '+' && command.charAt(command.length() - 1) != '*' &&
                        command.charAt(command.length() - 1) != '/') {
                    if (command.contains("+") || command.contains("-") || command.contains("*") || command.contains("/")) {
                        command = method() + "-";
                        field.setText(command);
                    } else {
                        command = command + "-";
                        field.setText(command);
                    }
                }
            }
        });
        multiply.setOnAction(x -> {
            if (command.charAt(command.length() - 1) != '-' && command.charAt(command.length() - 1) != '+' && command.charAt(command.length() - 1) != '*' &&
                    command.charAt(command.length() - 1) != '/') {
                if (command.contains("+") || command.contains("-") || command.contains("*") || command.contains("/")) {
                    command = method() + "*";
                    field.setText(command);
                } else {
                    command = command + "*";
                    field.setText(command);
                }
            }
        });

        divid.setOnAction(x -> {
            if (command.charAt(command.length() - 1) != '-' && command.charAt(command.length() - 1) != '+' && command.charAt(command.length() - 1) != '*' &&
                    command.charAt(command.length() - 1) != '/') {
                if (command.contains("+") || command.contains("-") || command.contains("*") || command.contains("/")) {
                    command = method() + "/";
                    field.setText(command);
                } else {
                    command = command + "/";
                    field.setText(command);
                }
            }
        });
        clear.setOnAction(x -> {
            command = "";
            field.setText(command);
            result.setText(command);
        });
        equals.setOnAction(x ->{
            method();
        });
    }
    public int method(){
        String str = field.getText();
        int a = solve(str);
        result.setText(String.valueOf(a));
        return a;
    }
    public int solve(String str){
        int index = 0;
        int resultCount = 0;
        if (str.contains("+")){
            index = str.indexOf("+");
            int a = Integer.parseInt(str.substring(0, index));
            int b = Integer.parseInt(str.substring(index+1));
            resultCount = a+b;
        }
        if (str.contains("-")){
            index = str.indexOf("-");
            int a = Integer.parseInt(str.substring(0, index));
            int b = Integer.parseInt(str.substring(index+1));
            resultCount = a-b;
        }
        if (str.contains("*")){
            index = str.indexOf("*");
            int a = Integer.parseInt(str.substring(0, index));
            int b = Integer.parseInt(str.substring(index+1));
            resultCount = a*b;
        }
        if (str.contains("/")){
            index = str.indexOf("/");
            int a = Integer.parseInt(str.substring(0, index));
            int b = Integer.parseInt(str.substring(index+1));
            resultCount = a/b;
        }
        return resultCount;
    }
}
