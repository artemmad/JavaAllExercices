package com.company.task11_12;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class Calculator extends Application {
    private double a=0;
    private double b=0;
    private Button Multiply;
    private Button plus;
    private Button minus;
    private Button divide;
    private TextField textField1;
    private TextField textField2;


    public void thisStart() {
        Application.launch();
    }


    private TextField textFieldMaker(int a) {
        if (a == 1) {
            textField1 = new TextField();
            textField1.setPrefSize(500, 100);
            textField1.setFont(Font.font(30));
            return textField1;
        } else {
            textField2 = new TextField();
            textField2.setLayoutY(110);
            textField2.setPrefSize(500, 100);
            textField2.setFont(Font.font(30));
            return textField2;
        }
    }



    private void calc(String c){

        {
            while (!textField1.getText().equals("")) {
                b = Double.parseDouble((textField1.getText()));
            }
            if (!textField1.getText().equals("")) {
                switch (c) {
                    case "*":
                        textField2.setText(String.valueOf(a * b));
                        break;
                    case "-":
                        textField2.setText(String.valueOf(a - b));
                        break;
                    case "/":
                        textField2.setText(String.valueOf(a / b));
                        break;
                    case "+":
                        textField2.setText(String.valueOf(a + b));
                        break;
                }
            }
        }
    }

    public void start(Stage stage) throws Exception {
        Multiply = new Button("*");
        Multiply.setFont(Font.font(100));
        Multiply.setLayoutX(0);
        Multiply.setLayoutY(280);
        plus = new Button("+");
        plus.setLayoutX(240);
        plus.setLayoutY(280);
        plus.setFont(Font.font(100));
        minus = new Button("-");
        minus.setLayoutX(240);
        minus.setLayoutY(500);
        minus.setFont(Font.font(100));
        divide = new Button("/");
        divide.setLayoutX(0);
        divide.setLayoutY(500);
        divide.setFont(Font.font(100));
        Text text = new Text("");
        text.setFont(Font.font(30));
        text.setLayoutY(110);
        Group group = new Group(textFieldMaker(1), textFieldMaker(2), Multiply, minus, plus, divide);

        Scene scene = new Scene(group, Color.RED);
        stage.setScene(scene);
        stage.setTitle("task 11_12");
        stage.setWidth(500);
        stage.setHeight(750);
        stage.show();
        stage.setScene(scene);
        stage.setTitle("TextField in JavaFX");
        stage.show();

        minus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                a = Double.parseDouble(textField1.getText());
                textField1.setText("");
                calc("-");
            }
        });
        plus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                a = Double.parseDouble(textField1.getText());
                textField1.setText("");
                calc("+");
            }
        });
        Multiply.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                a = Double.parseDouble(textField1.getText());
                textField1.setText("");
                calc("*");
            }
        });
        divide.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
               a = Double.parseDouble((textField1.getText()));
               textField1.setText("");
               calc("/");

            }
        });

    }
}

