module org.example.log {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.log to javafx.fxml;
    exports org.example.log;
}