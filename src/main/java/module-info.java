module com.example.scenebuilder {
    requires transitive javafx.controls; //added transitive
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;
	requires javafx.graphics;

    opens com.example.scenebuilder to javafx.fxml;
    exports com.example.scenebuilder;
}