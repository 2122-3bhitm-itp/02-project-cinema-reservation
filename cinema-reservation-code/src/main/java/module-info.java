module at.htl.cinemareservation {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens at.htl.cinemareservation to javafx.fxml;
    exports at.htl.cinemareservation;
}