package com.alertbox;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ConfirmBox {
    static  boolean answer;

    public static boolean display(String text, String message){
            Stage window;
            window = new Stage();
            window.initModality(Modality.APPLICATION_MODAL);
            window.setTitle(text);
            Label label = new Label();
            label.setText(message);
//two buttons to respond

        Button yesButton = new Button("click yes");
        Button noButton = new Button("click No");

        yesButton.setOnAction(e->{
            answer = true;
          window.close();
                }
        );


        noButton.setOnAction(e->{
                    answer = false;
                    window.close();
                }
        );

            VBox box = new VBox(10);
            box.getChildren().addAll(label,yesButton,noButton);
            Scene scene = new Scene(box,200,200);
            window.setScene(scene);
            window.show();
        return answer;
    }

    }

