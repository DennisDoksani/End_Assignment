module com.example.endassignment {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.jfxtras.styles.jmetro;

    opens com.example.endassignment to javafx.fxml;
    exports com.example.endassignment;
}