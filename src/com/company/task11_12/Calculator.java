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
    private double a = 0;
    private double b = 0;
    private Button Multiply;
    private Button plus;
    private Button minus;
    private Button divide;
    private Button equals;
    String c;
    private TextField textField1;


    public void thisStart() {
        Application.launch();
    }


    private TextField textFieldMaker(int a) {
        textField1 = new TextField();
        textField1.setPrefSize(500, 100);
        textField1.setFont(Font.font(30));
        return textField1;

    }


    public void start(Stage stage) throws Exception {
        Multiply = new Button("*");
        Multiply.setFont(Font.font(80));
        Multiply.setLayoutX(0);
        Multiply.setLayoutY(100);
        Multiply.setPrefSize(225,200);
        plus = new Button("+");
        plus.setLayoutX(250);
        plus.setLayoutY(100);
        plus.setFont(Font.font(80));
        plus.setPrefSize(225,200);
        minus = new Button("-");
        minus.setLayoutX(250);
        minus.setLayoutY(310);
        minus.setFont(Font.font(80));
        minus.setPrefSize(225,200);
        divide = new Button("/");
        divide.setPrefSize(225,200);
        divide.setLayoutX(0);
        divide.setLayoutY(310);
        divide.setFont(Font.font(80));
        equals = new Button("=");
        equals.setLayoutX(0);
        equals.setLayoutY(520);
        equals.setFont(Font.font(80));
        equals.setPrefSize(500, 100);
        Group group = new Group(textFieldMaker(1), Multiply, minus, plus, divide, equals);

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
                textField1.clear();
                c = "-";
            }
        });
        plus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                a = Double.parseDouble(textField1.getText());
                textField1.clear();
                c = "+";
            }
        });
        Multiply.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                a = Double.parseDouble(textField1.getText());
                textField1.clear();
                c = "*";
            }
        });
        divide.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                a = Double.parseDouble((textField1.getText()));
                textField1.clear();
                c = "/";

            }
        });
        equals.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                b = Double.parseDouble((textField1.getText()));
                textField1.clear();
                calc(c);
            }
        });

    }

    private void calc(String c) {

                if (c.equals("*")) {
                    textField1.setText(String.valueOf(a * b));
                }
                else if (c.equals("-"))
                        textField1.setText(String.valueOf(a - b));
                else if( c.equals("/"))
                        textField1.setText(String.valueOf(a / b));
                else
                    textField1.setText(String.valueOf(a + b));
    }
}


