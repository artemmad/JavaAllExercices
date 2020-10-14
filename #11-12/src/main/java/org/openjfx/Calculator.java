package org.openjfx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Calculator extends Application {

    private boolean isFirst = false;
    private int num1 = 0;
    private int num2 = 0;
    private String operation = "";
    private TextField textField;
    private Button add;
    private Button subtract;
    private Button multiply;
    private Button divide;
    private Button equals;
    private Label answer;


    public void Launch() {
        Application.launch();
    }

    public void OnAction(ActionEvent event){
    if (!isFirst){
        if (event.getSource() == add) operation = "+";
        else if (event.getSource() == subtract) operation = "-";
        else if (event.getSource() == multiply) operation = "*";
        else if (event.getSource() == divide) operation = "/";
        if (operation != ""){
            num1 = Integer.parseInt(textField.getText());
            textField.setText("");
            isFirst=true;
            answer.setText("");
        }
    }
    else if (isFirst && event.getSource() == equals){
        num2 = Integer.parseInt(textField.getText());
        switch (operation){
            case "+":
                answer.setText(""+(num1+num2));
                break;
            case "-":
                answer.setText(""+(num1-num2));
                break;
            case "*":
                answer.setText(""+(num1*num2));
                break;
            case "/":
                answer.setText(""+(num1/num2));
                break;
        }
        textField.setText("");
        operation = "";
        isFirst=false;
        num1=0;
        num2=0;
    }
    }

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Calculator");
        primaryStage.setWidth(300);
        primaryStage.setHeight(400);
        primaryStage.setResizable(false);

        textField = new TextField("");
        textField.setAlignment(Pos.CENTER);
        add = new Button("+");
        subtract = new Button("-");
        multiply = new Button("*");
        divide = new Button("/");
        equals = new Button("=");
        answer = new Label();
        answer.setFont(Font.font(90));
        answer.setAlignment(Pos.CENTER);
        GridPane root = new GridPane();

        root.setAlignment(Pos.CENTER);
        root.setHgap(10);

        root.setVgap(10);
        root.add(add, 0, 0);
        root.add(subtract, 1, 0);
        root.add(multiply, 0, 1);
        root.add(divide, 1, 1);
        root.add(equals, 0, 2, 2, 1);
        root.add(textField, 0, 3, 2, 1);
        root.add(answer, 0, 4, 2, 1);

        textField.setPrefWidth(150);
        add.setPrefWidth(70);
        subtract.setPrefWidth(70);
        multiply.setPrefWidth(70);
        divide.setPrefWidth(70);
        answer.setPrefWidth(150);
        equals.setPrefWidth(150);

        add.setOnAction(e -> OnAction(e));
        subtract.setOnAction(e -> OnAction(e));
        multiply.setOnAction(e -> OnAction(e));
        divide.setOnAction(e -> OnAction(e));
        equals.setOnAction(e -> OnAction(e));

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

