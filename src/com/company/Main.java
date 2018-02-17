package com.company;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application implements EventHandler<ActionEvent>{
    Button button;
    public static void main(String[] args) {
launch(args);    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        button = new Button();

        primaryStage = new Stage();
        button.setText("click");
        button.setOnAction(this);
        StackPane pane = new StackPane();
        pane.getChildren().add(button);
        Scene sc = new Scene(pane,400,400);
        primaryStage.setScene(sc);
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        if(event.getSource()==button){
            System.out.println("you have clicked  the button");
        }
    }
}
