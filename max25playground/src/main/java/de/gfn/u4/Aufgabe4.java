package de.gfn.u4;

import java.util.Scanner;

public class Aufgabe4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Minuten: ");
        int minuten = scanner.nextInt();

        int sekunden = minuten * 60;

        System.out.println(minuten + " Minuten sind " + sekunden + " Sekunden.");

        System.out.println();

        System.out.print("Gib eine Zahl ein: ");
        int zahl = scanner.nextInt();

        if(zahl % 2 == 0) {
            System.out.println("Die Zahl ist gerade!");
        }
        else {
            System.out.println("Die Zahl ist ungerade!");
        }

        System.out.println();

        System.out.print("Gib dein Alter ein: ");
        int alter = scanner.nextInt();

        if(alter <= 12) {
            System.out.println("Du bist ein Kind!");
        } else if (alter <= 19) {
            System.out.println("Du bist ein Teenager!");
        } else if (alter <= 64) {
            System.out.println("Du bist ein Erwachsener!");
        }
        else {
            System.out.println("Du bist ein Senior!");
        }

        System.out.println();

        System.out.print("Gib dein Alter ein: ");
        int alter1 = scanner.nextInt();
        System.out.print("Gib den Preis ein: ");
        double preis = scanner.nextDouble();

        if(alter1 <= 18) {
            double rabatt = 0.2;
            double neuerPreis = preis * (1 - rabatt);
            System.out.println("Du bist unter 18!");
            System.out.println("Der neue Preis nach " + rabatt + "% Rabatt beträgt: " + neuerPreis + " €");
        }
        else {
            double rabatt = 0.1;
            double neuerPreis = preis * (1 - rabatt);
            System.out.println("Du bist über 18!");
            System.out.println("Der neue Preis nach " + rabatt + "% Rabatt beträgt: " + neuerPreis + " €");
        }
    }
}
