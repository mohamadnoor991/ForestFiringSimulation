module com.example.forestfires2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.forestfires2 to javafx.fxml;
    exports com.example.forestfires2;
}