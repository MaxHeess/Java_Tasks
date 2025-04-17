package de.gfn.u2;

public class Aufgabe2 {

    public String kennzeichen;
    public String marke;
    public String modell;
    public int kilometerstand;

    public Aufgabe2(String kennzeichen, String marke, String modell, int kilometerstand) {
        this.kennzeichen = kennzeichen;
        this.marke = marke;
        this.modell = modell;
        this.kilometerstand = kilometerstand;
    }

    public void fahre(int km) {
        this.kilometerstand += km;
        System.out.println("Das Auto ist ein " + marke + " " + modell + " und hat das Kennzeichen " + kennzeichen + ".");
        System.out.println("Der aktuelle Kilometerstand beträgt " + kilometerstand + " km.");
    }

}
