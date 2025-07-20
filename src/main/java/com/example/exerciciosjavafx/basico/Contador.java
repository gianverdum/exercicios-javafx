package com.example.exerciciosjavafx.basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Label labelTitulo = new Label("Contador");
        Label labelNumero = new Label("0");

        Button buttonIncrement = new Button("+");
        Button buttonDecrement = new Button("-");

        HBox boxButtons = new HBox();
        boxButtons.setAlignment(Pos.CENTER);
        boxButtons.setSpacing(10);
        boxButtons.getChildren().addAll(buttonIncrement, buttonDecrement);

        VBox boxPrincipal = new VBox();
        boxPrincipal.setAlignment(Pos.CENTER);
        boxPrincipal.setSpacing(10);
        boxPrincipal.getChildren().addAll(labelTitulo, labelNumero, boxButtons);
        Scene sceneMain = new Scene(boxPrincipal, 400, 400);

        stage.setScene(sceneMain);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
