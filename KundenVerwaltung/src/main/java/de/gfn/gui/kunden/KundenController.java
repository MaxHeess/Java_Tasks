package de.gfn.gui.kunden;

import de.gfn.gui.kunden.model.Kunde;
import de.gfn.gui.kunden.model.KundenCrud;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

public class KundenController implements Initializable {

    @FXML
    private TextField vorname;

    @FXML
    private TextField nachname;

    @FXML
    private CheckBox aktiv;

    @FXML
    private TableView<Kunde> kundenTbl;

    private KundenCrud crud = new KundenCrud();

    @FXML
    protected void save() {
        // Formular wird abgefragt und das Objekt daraus erzeugt
        Kunde kunde = new Kunde(vorname.getText(), nachname.getText());
        if(aktiv.isSelected()) {
            kunde.setAktiv(true);
        }

        try {
            if (crud.save(kunde)) {
                System.out.println("Gespeichert");
                clearForm();
                showKunden();
            }
        }
        catch(Exception e) {
            System.out.println("Problem");
        }
    }

    @FXML
    protected void delete() {
        // Fragt das Objekt aus der ausgewählten Zeile in der Tabelle
        Kunde ausgewaelt = kundenTbl.getSelectionModel().getSelectedItem();
        if(ausgewaelt != null) {
            try {
                crud.delete(ausgewaelt);
                showKunden();
            }
            catch (SQLException e) {
                System.out.println("Problem");
            }

        }
    }

    // Zustand des Formulars zurücksetzen
    private void clearForm() {
        vorname.clear();
        nachname.clear();
        aktiv.setSelected(false);
    }

    private void showKunden() {
        try {
            List<Kunde> kunden = crud.findAll(); // Kunden aus der DB abfragen
            kundenTbl.setItems(FXCollections.observableList(kunden)); // Kunden in der TableView anzeigen
            kundenTbl.refresh();
        }
        catch(Exception e) {
            System.out.println("Problem");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        showKunden();
    }
}