module com.example.gramaticalisp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires antlr;

    opens com.example.gramaticalisp to javafx.fxml;
    exports com.example.gramaticalisp;
}