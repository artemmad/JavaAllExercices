package com.company.task11_12;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SampleHelloWorld  extends Application {

    public SampleHelloWorld() {
    }
    public void launcchthis(){
        Application.launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Text text = new Text("Hello World");
        text.setFont(Font.font(90));
        text.setLayoutY(400);
        text.setLayoutX(500);

        Group group = new Group(text);

        Scene scene = new Scene(group, Color.RED);
        stage.setScene(scene);
        stage.setTitle("task 11_12");
        stage.setWidth(1600);
        stage.setHeight(950);
        stage.show();
    }

}
