module com.mycompany.t22.estudiantes {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.t22.estudiantes to javafx.fxml;
    exports com.mycompany.t22.estudiantes;
}
