module com.example.tareas {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.tareas to javafx.fxml;
    exports com.example.tareas;
}