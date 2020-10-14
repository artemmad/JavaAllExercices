package org.openjfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloWorld extends Application {

    public void Launch(){
        Application.launch();
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World");
        primaryStage.setWidth(1280);
        primaryStage.setHeight(720);

        Text text = new Text("Hello World");
        text.setFont(Font.font(90));
        text.setFill(Color.rgb(225,225,225));

        StackPane root = new StackPane();
        root.getChildren().add(text);

        Scene scene = new Scene(root, Color.rgb(28,28,28));
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
