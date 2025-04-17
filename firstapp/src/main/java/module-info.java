module de.gfn.gui.firstapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens de.gfn.gui.firstapp to javafx.fxml;
    exports de.gfn.gui.firstapp;
}