package de.gfn.gui.firstapp;


public class Aufgabe15 {

    private String vorname;
    private String nachname;
    private String alter;

    public Aufgabe15() {
    }

    public Aufgabe15(String vorname, String nachname, String alter) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getAlter() {
        return alter;
    }

    public void setAlter(String alter) {
        this.alter = alter;
    }
}