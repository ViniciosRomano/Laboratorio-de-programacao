module com.example.samuapplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.bytedeco.opencv;


    opens com.example.samuapplication to javafx.fxml;
    exports com.example.samuapplication;
}