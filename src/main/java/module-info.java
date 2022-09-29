module com.example.scrollbar {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.scrollbar to javafx.fxml;
    exports com.example.scrollbar;
}