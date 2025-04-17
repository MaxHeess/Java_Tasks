package de.gfn.u1;

public class Aufgabe1 {

    public String titel;
    public String autor;
    public int seiten;
    public double preis;

    public Aufgabe1(String titel, String autor, int seiten, double preis) {
        this.titel = titel;
        this.autor = autor;
        this.seiten = seiten;
        this.preis = preis;
    }

    public void buch1() {
        System.out.println("Das Buch heißt " + titel + ", wurde von " + autor + " geschrieben, hat " + seiten + " Seiten und kostet " + preis + " €.");
    }
}