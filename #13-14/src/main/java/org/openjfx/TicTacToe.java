package org.openjfx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToe extends Application {

    private boolean isFirst = true;
    private int game = 0;
    private boolean endGame = false;
    private final Button[] fields = new Button[16];
    private Label result;
    private final String[] texts = new String[16];
    private String buff = "";

    public void OnAction(Button button){
        if (button.getText().equals("") && !endGame){
            game++;
            if (isFirst) {button.setText("X");
            button.setTextFill(Color.rgb(10, 0, 200));
            isFirst = false;
            }
            else {button.setText("O");
                button.setTextFill(Color.rgb(200, 0, 0));
                isFirst = true;
            }
            for (int i=0; i<16; i++) texts[i] = fields[i].getText();

            if ((texts[0].equals(texts[1]) && texts[0].equals(texts[2]) && texts[0].equals("X"))) buff = "X";
            if ((texts[1].equals(texts[2]) && texts[1].equals(texts[3]) && texts[1].equals("X"))) buff = "X";
            if ((texts[4].equals(texts[5]) && texts[4].equals(texts[6]) && texts[4].equals("X"))) buff = "X";
            if ((texts[5].equals(texts[6]) && texts[5].equals(texts[7]) && texts[5].equals("X"))) buff = "X";
            if ((texts[8].equals(texts[9]) && texts[8].equals(texts[10]) && texts[8].equals("X"))) buff = "X";
            if ((texts[9].equals(texts[10]) && texts[9].equals(texts[11]) && texts[9].equals("X"))) buff = "X";
            if ((texts[12].equals(texts[13]) && texts[12].equals(texts[14]) && texts[12].equals("X"))) buff = "X";
            if ((texts[13].equals(texts[14]) && texts[13].equals(texts[15]) && texts[13].equals("X"))) buff = "X";

            if ((texts[0].equals(texts[4]) && texts[0].equals(texts[8]) && texts[0].equals("X"))) buff = "X";
            if ((texts[4].equals(texts[8]) && texts[4].equals(texts[12]) && texts[4].equals("X"))) buff = "X";
            if ((texts[1].equals(texts[5]) && texts[1].equals(texts[9]) && texts[1].equals("X"))) buff = "X";
            if ((texts[5].equals(texts[9]) && texts[5].equals(texts[13]) && texts[5].equals("X"))) buff = "X";
            if ((texts[2].equals(texts[6]) && texts[2].equals(texts[10]) && texts[2].equals("X"))) buff = "X";
            if ((texts[6].equals(texts[10]) && texts[6].equals(texts[14]) && texts[6].equals("X"))) buff = "X";
            if ((texts[3].equals(texts[7]) && texts[3].equals(texts[11]) && texts[3].equals("X"))) buff = "X";
            if ((texts[7].equals(texts[11]) && texts[7].equals(texts[15]) && texts[7].equals("X"))) buff = "X";

            if ((texts[0].equals(texts[5]) && texts[0].equals(texts[10]) && texts[0].equals("X"))) buff = "X";
            if ((texts[1].equals(texts[6]) && texts[1].equals(texts[11]) && texts[1].equals("X"))) buff = "X";
            if ((texts[4].equals(texts[9]) && texts[4].equals(texts[14]) && texts[4].equals("X"))) buff = "X";
            if ((texts[5].equals(texts[10]) && texts[5].equals(texts[15]) && texts[5].equals("X"))) buff = "X";

            if ((texts[2].equals(texts[5]) && texts[2].equals(texts[8]) && texts[2].equals("X"))) buff = "X";
            if ((texts[3].equals(texts[6]) && texts[3].equals(texts[9]) && texts[3].equals("X"))) buff = "X";
            if ((texts[6].equals(texts[9]) && texts[6].equals(texts[12]) && texts[6].equals("X"))) buff = "X";
            if ((texts[7].equals(texts[10]) && texts[7].equals(texts[13]) && texts[7].equals("X"))) buff = "X";



            if ((texts[0].equals(texts[1]) && texts[0].equals(texts[2]) && texts[0].equals("O"))) buff = "O";
            if ((texts[1].equals(texts[2]) && texts[1].equals(texts[3]) && texts[1].equals("O"))) buff = "O";
            if ((texts[4].equals(texts[5]) && texts[4].equals(texts[6]) && texts[4].equals("O"))) buff = "O";
            if ((texts[5].equals(texts[6]) && texts[5].equals(texts[7]) && texts[5].equals("O"))) buff = "O";
            if ((texts[8].equals(texts[9]) && texts[8].equals(texts[10]) && texts[8].equals("O"))) buff = "O";
            if ((texts[9].equals(texts[10]) && texts[9].equals(texts[11]) && texts[9].equals("O"))) buff = "O";
            if ((texts[12].equals(texts[13]) && texts[12].equals(texts[14]) && texts[12].equals("O"))) buff = "O";
            if ((texts[13].equals(texts[14]) && texts[13].equals(texts[15]) && texts[13].equals("O"))) buff = "O";

            if ((texts[0].equals(texts[4]) && texts[0].equals(texts[8]) && texts[0].equals("O"))) buff = "O";
            if ((texts[4].equals(texts[8]) && texts[4].equals(texts[12]) && texts[4].equals("O"))) buff = "O";
            if ((texts[1].equals(texts[5]) && texts[1].equals(texts[9]) && texts[1].equals("O"))) buff = "O";
            if ((texts[5].equals(texts[9]) && texts[5].equals(texts[13]) && texts[5].equals("O"))) buff = "O";
            if ((texts[2].equals(texts[6]) && texts[2].equals(texts[10]) && texts[2].equals("O"))) buff = "O";
            if ((texts[6].equals(texts[10]) && texts[6].equals(texts[14]) && texts[6].equals("O"))) buff = "O";
            if ((texts[3].equals(texts[7]) && texts[3].equals(texts[11]) && texts[3].equals("O"))) buff = "O";
            if ((texts[7].equals(texts[11]) && texts[7].equals(texts[15]) && texts[7].equals("O"))) buff = "O";

            if ((texts[0].equals(texts[5]) && texts[0].equals(texts[10]) && texts[0].equals("O"))) buff = "O";
            if ((texts[1].equals(texts[6]) && texts[1].equals(texts[11]) && texts[1].equals("O"))) buff = "O";
            if ((texts[4].equals(texts[9]) && texts[4].equals(texts[14]) && texts[4].equals("O"))) buff = "O";
            if ((texts[5].equals(texts[10]) && texts[5].equals(texts[15]) && texts[5].equals("O"))) buff = "O";

            if ((texts[2].equals(texts[5]) && texts[2].equals(texts[8]) && texts[2].equals("O"))) buff = "O";
            if ((texts[3].equals(texts[6]) && texts[3].equals(texts[9]) && texts[3].equals("O"))) buff = "O";
            if ((texts[6].equals(texts[9]) && texts[6].equals(texts[12]) && texts[6].equals("O"))) buff = "O";
            if ((texts[7].equals(texts[10]) && texts[7].equals(texts[13]) && texts[7].equals("O"))) buff = "O";

            if (!buff.equals("") || game == 16) {
                endGame = true;
                if (game == 16) result.setText("Draw");
                else if (buff.equals("X")) result.setText("Blu wins");
                else result.setText("Red wins");
            }
        }


    }

    public void Launch() {
        Application.launch();
    }

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setWidth(300);
        primaryStage.setHeight(400);
        primaryStage.setResizable(false);

        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(0);
        root.setVgap(0);

        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                fields[i*4+j] = new Button();
                fields[i*4+j].setPrefSize(40,40);
                fields[i*4+j].setFont(Font.font(15));
                root.add(fields[i*4+j], i, j);
            }
        }
        result = new Label("");
        result.setFont(Font.font(30));
        result.setAlignment(Pos.CENTER);
        result.setPrefWidth(160);
        root.add (result, 0, 4, 4, 1);
        for (Button button : fields){
            button.setOnAction(e -> OnAction(button));
        }

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

