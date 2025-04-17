package de.gfn.u3;

import java.util.Scanner;

public class Aufgabe3 {

    public static void main(String[] args) {

        int zahl = (int) (Math.random() * 10) + 1;
        Scanner scanner = new Scanner(System.in);
        int versuch = 1;
        int maxVersuche = 5;

        while (versuch <= maxVersuche) {
            System.out.print("Versuch " + versuch + ":\nGib eine Zahl zwischen 1 und 10 ein: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Fehler! Bitte gib eine gültige Zahl zwischen 1 und 10 ein.");
                scanner.next();
                continue;
            }

            int a = scanner.nextInt();

            if (a < 1 || a > 10) {
                System.out.println("Fehler! Die Zahl muss zwischen 1 und 10 liegen. Versuche es nochmal.");
                continue;
            }

            if (a == zahl) {
                System.out.println("Ja, das ist die richtige Zahl! Glückwunsch!");
                break;
            } else {
                if (versuch < maxVersuche) {
                    System.out.println("Falsch! Versuche es noch einmal.");
                }
                versuch++;
            }
        }

        if (versuch > maxVersuche) {
            System.out.println("Game Over! Die richtige Zahl war: " + zahl);
        }
    }
}

