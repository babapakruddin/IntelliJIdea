package com.company;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application {
    Button button;
    public static void main(String[] args) {
launch(args);    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        button = new Button();

        primaryStage = new Stage();
        button.setText("click");
        button.setOnAction(e -> System.out.println("lambda"));
        StackPane pane = new StackPane();
        pane.getChildren().add(button);
        Scene sc = new Scene(pane,400,400);
        primaryStage.setScene(sc);
        primaryStage.show();
    }
}
