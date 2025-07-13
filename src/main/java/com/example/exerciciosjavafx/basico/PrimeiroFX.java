package com.example.exerciciosjavafx.basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PrimeiroFX extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Button buttonA = new Button("A");
        Button buttonB = new Button("B");
        Button buttonC = new Button("C");
        buttonA.setOnAction(event -> System.out.println("clicked"));
        buttonB.setOnAction(event -> System.out.println("clicked"));
        buttonC.setOnAction(event -> System.exit(0));
        VBox box = new VBox();
        box.setAlignment(Pos.CENTER);
        box.setSpacing(10);
        box.getChildren().addAll(buttonA, buttonB, buttonC);
        Scene scene = new Scene(box, 100, 150);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
