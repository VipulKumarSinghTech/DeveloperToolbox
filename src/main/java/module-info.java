module com.github.vipulkumarsinghtech.developertoolbox {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires com.google.gson;

    opens com.github.vipulkumarsinghtech.developertoolbox to javafx.fxml;
    exports com.github.vipulkumarsinghtech.developertoolbox;
}