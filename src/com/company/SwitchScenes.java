package com.company;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import  javafx.scene.control.Label;


import java.awt.*;

public class SwitchScenes extends Application {
    Stage window;
    Scene scene1, scene2;
public static void main(String[] args){
    launch(args);
}
    @Override
    public void start(Stage primaryStage) throws Exception {
    window=primaryStage;

        Label lab1 = new Label("Welcome to scene");
        Button b1 = new Button("Go to scene2");
        VBox layout1 = new VBox();
        layout1.getChildren().addAll(lab1,b1);
        scene1 = new Scene(layout1,400,300);
        b1.setOnAction(e -> window.setScene(scene2));


        Label lab2 = new Label("Welcome to second page");
        Button b2 = new Button("Go to scene1");
        StackPane pane = new StackPane();
        pane.getChildren().addAll(lab2,b2);
        scene2 = new Scene(pane,400,300);
        b2.setOnAction(e -> window.setScene(scene1));

        window.setScene(scene1);
        window.show();
    }
}
