package de.gfn.u2;

public class Fahrzeug {

    public static void main(String[] args) {

        Aufgabe2 Fahrzeug1 = new Aufgabe2("ES-JK-526", "VW", "Golf", 25000);
        Fahrzeug1.fahre(9000);

        System.out.println();

        Aufgabe2 Fahrzeug2 = new Aufgabe2("WN-ML-925", "Audi", "A5", 14000);
        Fahrzeug2.fahre(6000);
    }
}
