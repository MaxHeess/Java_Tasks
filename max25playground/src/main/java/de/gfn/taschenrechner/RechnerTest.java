package de.gfn.taschenrechner;

import java.util.Scanner;

public class RechnerTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie die erste Zahl ein: ");
        int zahl1 = scanner.nextInt();

        System.out.print("Geben Sie die zweite Zahl ein: ");
        int zahl2 = scanner.nextInt();

        Rechner rechner = new Rechner();

        int addition = rechner.addition(zahl1, zahl2);
        System.out.println("Die Addition ergibt: " + addition);

        int subtraktion = rechner.subtraktion(zahl1, zahl2);
        System.out.println("Die Subtraktion ergibt: " + subtraktion);

        int multiplikation = rechner.multiplikation(zahl1, zahl2);
        System.out.println("Die Multiplikation ergibt: " + multiplikation);

        int division = rechner.division(zahl1, zahl2);
        System.out.println("Die Multiplikation ergibt: " + division);
    }
}