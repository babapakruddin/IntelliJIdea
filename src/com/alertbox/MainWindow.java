package com.alertbox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.*;

public class MainWindow extends Application {
    Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception {
        window =primaryStage;
        Label lab = new Label("main window");
        Button button = new Button("click for alert");
        button.setOnAction(e->{
                boolean result=ConfirmBox.display("Title of window", "are you sure to the task");
                System.out.println(result);
                }

        );
        StackPane sp = new StackPane();
        sp.getChildren().add(button);
        Scene scene = new Scene(sp,400,400);
        window.setScene(scene);
        window.show();
    }
}
