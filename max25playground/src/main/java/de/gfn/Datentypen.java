package de.gfn;

import java.util.Arrays;

public class Datentypen {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(args));

        String text = "Hallo";
        text = "Moin";

        byte b = 100;
        int i = b; // Ok, da byte kleiner ist als int

        short s = 1;
        // b = s; // Error: short ist zu groß für einen byte
        s = b; // Ok, da byte kleiner ist als short

        double d = b; // Ok, da byte kleiner ist als double

        // Komplexe Datentypen: Basieren auf Klassen

        System.out.println(100); // 100 ist ein Literal
        System.out.println(b); // b ist eine Variable

        System.out.println();

        // Deklaration und Initialisierung
        boolean exit = false;
        exit = true; // Änderung
        exit = false; // Änderung: Alter Wert geht verloren

        System.out.println(10 < 20);
        System.out.println(100 < 20);
        System.out.println(100 == 20);

        int zahl = 75;
        System.out.println(zahl > 20 && zahl < 100);

        System.out.println();

        byte b2 = 120;
        check(100);
        check(b2);


    }

    public static void check(byte b) {
        System.out.println("byte");
    }

    public static void check(int i) {
        System.out.println("int");
    }
}
