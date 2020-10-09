package sample;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.Group;

import javafx.scene.control.Label;
import javafx.scene.control.Button;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.ColumnConstraints;

import javafx.scene.paint.Color;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.stage.Stage;

import javafx.geometry.HPos;

import java.util.ArrayList;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class Main extends Application{
    private boolean operatorAlreadyPressed = false;
    private boolean secondOperand = false;
    private boolean scriptExceptionOccurred = false;
    public static void main(String[] args){
        Application.launch(args);
    }
    public void start(Stage primaryStage) throws ScriptException{
        int windowWidth = 190;
        int windowHeight = 250;
        primaryStage.setTitle("Calculator");
        primaryStage.setWidth(windowWidth);
        primaryStage.setHeight(windowHeight);
//      primaryStage.setResizable(false);
        VBox root = new VBox();
        Scene scene = new Scene(root, windowWidth, windowHeight, Color.WHITE);

        Label expressionLabel = new Label();
//      expressionLabel.setEditable(false);

        GridPane numberGrid = new GridPane();
        numberGrid.setHgap(5);
        numberGrid.setVgap(5);

        GridPane operatorGrid = new GridPane();
        operatorGrid.setHgap(5);
        operatorGrid.setVgap(5);
/*
        numberGrid.setGridLinesVisible(true);
        operatorGrid.setGridLinesVisible(true);
*/

        ArrayList<Button> numberButtons = new ArrayList<>();
        ArrayList<Button> operatorButtons = new ArrayList<>();

        int buttonCounter = 9;
        int buttonWidth = 50;
        int buttonHeight = 50;
        for(int y = 0; y < 4; y++){
            RowConstraints row = new RowConstraints();
            row.setPercentHeight(5);
            numberGrid.getRowConstraints().add(row);
            for(int x = 0; x < 3 && buttonCounter > -1; x++, buttonCounter--){
                if(y == 0){
                    ColumnConstraints column = new ColumnConstraints();
                    column.setPercentWidth(5);
                    column.setHalignment(HPos.CENTER);
                    numberGrid.getColumnConstraints().add(column);
                }
                Button button = new Button(String.valueOf(buttonCounter));
                button.setPrefWidth(buttonWidth);
                button.setPrefHeight(buttonHeight);
                numberButtons.add(button);
                numberGrid.add(button, x, y);
            }
        }
        String[][] operatorTextArr = {{"+", "-"}, {"*", "/"}, {"=", "c"}};
        for(int y = 0; y < operatorTextArr.length; y++){
            RowConstraints row = new RowConstraints();
            row.setPercentHeight(5);
            operatorGrid.getRowConstraints().add(row);
            for(int x = 0; x < operatorTextArr[y].length; x++){
                if(y == 0){
                    ColumnConstraints column = new ColumnConstraints();
                    column.setPercentWidth(5);
                    column.setHalignment(HPos.CENTER);
                    operatorGrid.getColumnConstraints().add(column);
                }
                Button button = new Button(operatorTextArr[y][x]);
                button.setPrefWidth(buttonWidth);
                button.setPrefHeight(buttonHeight);
                operatorButtons.add(button);
                operatorGrid.add(button, y, x);
            }
        }

        //Makes clicking the number buttons add to the expressionLabel
        for(int counter = 0; counter < numberButtons.size(); counter++){
            numberButtons.get(counter).setOnAction(new EventHandler<ActionEvent>(){
                public void handle(ActionEvent e){
                    //Gets info about the clicked button
                    Button temp = (Button)e.getSource();
                    if(scriptExceptionOccurred){
                        /*
                        Clears the label once the user tries to enter a new expression
                        after an exception occurred. Can't be done in catch 'cause, well,
                        we need to make sure the user sees the message
                        */
                        expressionLabel.setText("");
                        scriptExceptionOccurred = false;
                    }
                    String newexpressionText = expressionLabel.getText() + temp.getText();
                    expressionLabel.setText(newexpressionText);
                    System.out.println(newexpressionText);
                    //Adds the number on the button to the expression
                    if(operatorAlreadyPressed && !secondOperand){
                        /*
                        If any non-digit button is pressed, this tells the program
                        to evaluate the expression
                        */
                        secondOperand = true;
                    }
                }
            });
        }

        for(int counter = 0; counter < operatorButtons.size(); counter++){
            operatorButtons.get(counter).setOnAction(new EventHandler<ActionEvent>(){
                public void handle(ActionEvent e){
                    String text = expressionLabel.getText();
                    /*Same as above section*/
                    Button temp = (Button)e.getSource();
                    if(scriptExceptionOccurred){
                        expressionLabel.setText("");
                        scriptExceptionOccurred = false;
                    }
                    /*
                    If the clear button is pressed, and the expression has content
                    delete a character
                    */
                    if(temp.getText().equals("c") && expressionLabel.getText().length() > 0){
                        char charToDelete = text.charAt(text.length() - 1);
                        if(charToDelete == '+' || charToDelete == '-'
                                || charToDelete == '*' || charToDelete == '/'){
                            /*
                            Allows an operator to be pressed again if an
                            operator character is deleted
                            */
                            operatorAlreadyPressed = false;
                        }
                        expressionLabel.setText(expressionLabel.getText().substring(
                                0, expressionLabel.getText().length()-1));
                    }
                    /*
                    Only 1 operator is allowed in an expression. If there is none, and the operator pressed != "="
                    add it to expression
                    */
                    else if(!operatorAlreadyPressed && text.length() > 0 && !temp.getText().equals("=")){
                        String newexpressionText = expressionLabel.getText()
                                + temp.getText();
                        expressionLabel.setText(newexpressionText);
                        operatorAlreadyPressed = true;
                    }
                    //If there is another operator already, or the operator pressed == "=", evaluate expression
                    else if(secondOperand || temp.getText().equals("=")){
                        operatorAlreadyPressed = false;
                        secondOperand = false;
                        try{
                            ScriptEngineManager mgr = new ScriptEngineManager();
                            ScriptEngine engine = mgr.getEngineByName("JavaScript");
                            expressionLabel.setText(String.valueOf(engine.eval(
                                    expressionLabel.getText())));
                            /*
                            If the expression is evaluated because an operator was already there,
                            and the new operator != "=" and != "c", add the new operator to the
                            new expression
                            */
                            if(!temp.getText().equals("=") && !temp.getText().equals("c")){
                                expressionLabel.setText(expressionLabel.getText()
                                        + temp.getText());
                                operatorAlreadyPressed = true;
                            }
                        }
                        catch(ScriptException exc){
                            //Basically let the user know and reset important booleans.
                            expressionLabel.setText("Invalid operation.");
                            scriptExceptionOccurred = true;
                            secondOperand = false;
                            operatorAlreadyPressed = false;
                        }
                    }
                }
            });
        }

        root.getChildren().addAll(expressionLabel, numberGrid, operatorGrid);

        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.show();
    }
}
