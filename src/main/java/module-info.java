module com.example.mostusedwords {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mostusedwords to javafx.fxml;
    exports com.example.mostusedwords;
}