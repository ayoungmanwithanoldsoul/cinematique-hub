module edu.umindanao.cinematiquehub {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens edu.umindanao.cinematiquehub to javafx.fxml;
    exports edu.umindanao.cinematiquehub;
    exports edu.umindanao.uitesting;
    opens edu.umindanao.uitesting to javafx.fxml;
}