package com.com.checkbox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.*;

import java.awt.*;

public class CheckBoxEx extends Application {
    Stage window;

    public static void main(String [] args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        window=primaryStage;
        window.setTitle("meal checkbox");

        CheckBox box1= new CheckBox("Biryani");
        CheckBox box2 = new CheckBox("chicken");

        Button button= new Button("orders");
        button.setOnAction(e-> handleOptions(box1,box2));

        VBox box = new VBox();
        box.getChildren().addAll(box1,box2,button);
        Scene scene = new Scene(box,400,400);
        window.setScene(scene);
        window.show();
    }

    private  void handleOptions(CheckBox box1, CheckBox box2){
        String message = "selected items";
        if(box1.isSelected()){
            message+ = "birynai";
        }
        if(box2.isSelected()){
            message+ = " chicken";
        }
    }
}
