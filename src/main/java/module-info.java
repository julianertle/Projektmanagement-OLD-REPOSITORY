module com.example.pmt_theatercomedy_gruppg {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pmt_theatercomedy_gruppg to javafx.fxml;
    exports com.example.pmt_theatercomedy_gruppg;
}