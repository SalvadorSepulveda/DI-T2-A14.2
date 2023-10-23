module es.ieslosmontecillos.loginjavafxml {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.loginjavafxml to javafx.fxml;
    exports es.ieslosmontecillos.loginjavafxml;
}