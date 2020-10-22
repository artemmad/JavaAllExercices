package com.company.task13_14;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;

import java.awt.*;

public class board extends Application{
private int k=0;
private Tile[][] board =new Tile[3][3];
private boolean playable = true;
    private Parent createBoard(){
        Pane root= new Pane();

        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
               Tile tile=new Tile();
                tile.setTranslateX(i*200);
                tile.setTranslateY(j*200);
                root.getChildren().addAll(tile);
                board[i][j]=tile;
            }
        }

        return root;
    }
    private boolean check() {
        for (int i = 0; i < 3; i++) {

            if (!board[0][i].getValue().equals("") || !board[1][i].getValue().equals("") || !board[2][i].getValue().equals("")) {
                if (board[0][i].getValue().equals(board[1][i].getValue()) && board[1][i].getValue().equals(board[2][i].getValue())) {
                    endGameWin();
                    return true;
                }
            }
            else return true;
        }
        for (int i = 0; i < 3; i++) {

            if (!board[i][0].getValue().equals("") || !board[i][1].getValue().equals("") || !board[i][2].getValue().equals("")) {
                if (board[i][0].getValue().equals(board[i][1].getValue()) && board[i][1].getValue().equals(board[i][2].getValue())) {
                    endGameWin();
                    return true;
                }
            }
            else return true;
        }
        if (!board[0][0].getValue().equals("") || !board[1][1].getValue().equals("") || !board[2][2].getValue().equals("")) {
            if (board[0][0].getValue().equals(board[1][1].getValue()) && board[1][1].getValue().equals(board[2][2].getValue())) {
                endGameWin();
                return true;
            }
        }
        else return true;
        if (!board[0][2].getValue().equals("") && !board[1][1].getValue().equals("") && !board[2][0].getValue().equals("")) {
            if (board[0][2].getValue().equals(board[1][1].getValue()) && board[1][1].getValue().equals(board[2][0].getValue())) {
                endGameWin();
                return true;
            }
        }
        else return true;
           int c=0;
            for (int i=0;i<3;i++){
                for (int j=0;j<3;j++){
                    if(board[i][j].getValue()!=null)
                        c++;
                }
            }
            if (c==9){
                endGame();
                return true;
            }
        return true;
    }
    private void endGameWin(){
        playable=false;
        Win();
    }
    private void Win(){
        Line line=new Line();
    }
    private void endGame(){
        playable=false;
    }

    private class Tile extends StackPane {
        Text text = new Text();
        public Tile() {
            text.setFont(Font.font(80));
            Rectangle border = new Rectangle(200, 200);
            border.setFill(null);
            border.setStroke(Color.BLACK);
            getChildren().addAll(border, text);

            setOnMouseClicked(event -> {

                if (playable==true) {
                    if (k % 2 == 0) {
                        X();
                        k++;
                        check();
                    } else {
                        O();
                        k++;
                        check();
                    }
                }
            });

        }
        private void X(){
            text.setText("x");
        }
        private void O(){
            text.setText("O");
        }
        public String getValue() {
            return text.getText();
        }
    }

    public void start(Stage stage) throws Exception {

        Group group = new Group();
        Scene scene = new Scene(createBoard(), Color.BLUEVIOLET);
        stage.setScene(scene);
        stage.setTitle("task 11_12");
        stage.setWidth(610);
        stage.setHeight(630);
        stage.show();
        stage.setScene(scene);
        stage.setTitle("TextField in JavaFX");
        stage.show();
    }
}
