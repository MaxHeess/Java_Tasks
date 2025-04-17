package de.gfn.gui.firstapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class HelloController {

    @FXML // Annotation: Verbindet die Elemente in der Oberfläche mit Java
    private Label ausgabe;

    @FXML
    private TextField eingabe;

    @FXML
    private TextField eingabe2;

    @FXML
    private TextField eingabe3;

    private List<Aufgabe15> aufgabenListe = new ArrayList<>();

    @FXML
    protected void save() {
        String vorname = eingabe.getText();
        String nachname = eingabe2.getText();
        String alter = eingabe3.getText();

        if (vorname.trim().isEmpty() || nachname.trim().isEmpty() || alter.trim().isEmpty()) return;

        aufgabenListe.add(new Aufgabe15(vorname, nachname, alter));

        eingabe.clear();
        eingabe2.clear();
        eingabe3.clear();

        showTask();
    }

    private void showTask() {
        StringBuilder sb = new StringBuilder();
        for (Aufgabe15 t : aufgabenListe) {
            sb.append("Name: ").append(t.getVorname()).append(" ");
            sb.append(t.getNachname()).append("\n");
            sb.append("Alter: ").append(t.getAlter()).append("\n\n");
        }
        ausgabe.setText(sb.toString());
    }
}