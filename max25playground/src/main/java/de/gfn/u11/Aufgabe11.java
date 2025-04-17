package de.gfn.u11;

public class Aufgabe11 {
    public static void main(String[] args) {
        // Erstellen von Instanzen der Klasse Kunde
        Kunde kunde1 = new Kunde("Max Mustermann", "max@example.com");
        Kunde kunde2 = new Kunde("Max Mustermann", "max@example.com");
        Kunde kunde3 = new Kunde("Erika Musterfrau", "erika@example.com");

        // Testen von equals und hashCode für die Klasse Kunde
        System.out.println("kunde1 equals kunde2: " + kunde1.equals(kunde2));  // Sollte true sein
        System.out.println("kunde1 equals kunde3: " + kunde1.equals(kunde3));  // Sollte false sein
        System.out.println("kunde1 hashCode: " + kunde1.hashCode());
        System.out.println("kunde2 hashCode: " + kunde2.hashCode());
        System.out.println("kunde3 hashCode: " + kunde3.hashCode());

        // Erstellen von Instanzen der Klasse Film
        Film film1 = new Film("Inception", "Christopher Nolan");
        Film film2 = new Film("Inception", "Christopher Nolan");
        Film film3 = new Film("The Dark Knight", "Christopher Nolan");

        // Testen von equals und hashCode für die Klasse Film
        System.out.println("film1 equals film2: " + film1.equals(film2));  // Sollte true sein
        System.out.println("film1 equals film3: " + film1.equals(film3));  // Sollte false sein
        System.out.println("film1 hashCode: " + film1.hashCode());
        System.out.println("film2 hashCode: " + film2.hashCode());
        System.out.println("film3 hashCode: " + film3.hashCode());
    }
}
