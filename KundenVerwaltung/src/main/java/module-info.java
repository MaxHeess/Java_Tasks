module de.gfn.gui.kunden {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens de.gfn.gui.kunden to javafx.fxml;
    opens de.gfn.gui.kunden.model to javafx.base;
    exports de.gfn.gui.kunden;
}