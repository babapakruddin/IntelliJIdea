package com.alertbox;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox  {

    public static void display(String text, String message){
        Stage window;
        window = new Stage();
       window.initModality(Modality.APPLICATION_MODAL);
       window.setTitle(text);
       Label label = new Label();
        label.setText(message);

        VBox box = new VBox(label);

        Scene scene = new Scene(box,200,200);
        window.setScene(scene);
        window.show();
    }
}
