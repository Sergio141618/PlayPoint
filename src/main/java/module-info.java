module es.cifpcarlos3.playpoint {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.cifpcarlos3.playpoint to javafx.fxml;
    exports es.cifpcarlos3.playpoint;
}