module com.example.pmt_theatercomedy_gruppg {
    requires javafx.controls;
    requires javafx.fxml;


    opens de.hhn.ai.pmt.theatercomedy.model to javafx.fxml;
    exports de.hhn.ai.pmt.theatercomedy.model;
    exports de.hhn.ai.pmt.theatercomedy.control;
    opens de.hhn.ai.pmt.theatercomedy.control to javafx.fxml;
    exports de.hhn.ai.pmt.theatercomedy.view;
    opens de.hhn.ai.pmt.theatercomedy.view to javafx.fxml;
}