module com.example.exerciciosjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.exerciciosjavafx to javafx.fxml;
    exports com.example.exerciciosjavafx;
    exports com.example.exerciciosjavafx.basico;
}