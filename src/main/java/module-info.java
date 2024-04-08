module com.example.jhonsnetcafe {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.jhonsnetcafe to javafx.fxml;
    exports com.example.jhonsnetcafe;
}