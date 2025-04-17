module de.gfn.gui.personen {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens de.gfn.gui.personen to javafx.fxml;
    exports de.gfn.gui.personen;
}