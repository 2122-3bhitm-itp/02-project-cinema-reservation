module at.htl.cinemareservation {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.mybatis;

    opens at.htl.cinemareservation to javafx.fxml;
    exports at.htl.cinemareservation;
}