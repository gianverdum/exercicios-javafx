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

    private int contador = 0;

    @Override
    public void start(Stage stage) throws Exception {
        Label labelTitulo = new Label("Contador");
        labelTitulo.getStyleClass().add("titulo");

        Label labelNumero = new Label("0");
        labelNumero.getStyleClass().add("numero");

        Button buttonIncrement = new Button("+");
        buttonIncrement.setOnAction(e -> {
            contador++;
            labelNumero.setText(Integer.toString(contador));
        });
        Button buttonDecrement = new Button("-");
        buttonDecrement.setOnAction(e -> {
            contador--;
            labelNumero.setText(Integer.toString(contador));
        });

        HBox boxButtons = new HBox();
        boxButtons.setAlignment(Pos.CENTER);
        boxButtons.setSpacing(10);
        boxButtons.getChildren().addAll(buttonIncrement, buttonDecrement);

        VBox boxConteudo = new VBox();
        boxConteudo.getStyleClass().add("conteudo");
        boxConteudo.setAlignment(Pos.CENTER);
        boxConteudo.setSpacing(10);
        boxConteudo.getChildren().addAll(labelTitulo, labelNumero, boxButtons);

        String caminhoDoCss = getClass()
                .getResource("/com/example/exerciciosjavafx/basico/Contador.css")
                .toExternalForm();
        Scene sceneMain = new Scene(boxConteudo, 400, 400);
        sceneMain.getStylesheets().add(caminhoDoCss);
        sceneMain.getStylesheets().add("https://fonts.googleapis.com/css2?family=Bitcount+Grid+Single:wght@100..900");

        stage.setScene(sceneMain);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
