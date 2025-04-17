package de.gfn;

public class Person {

    public String vorname;
    public String nachname;
    public int alter;
    public boolean fuehrerschein;

    public Person() {
    }

    public Person(String vorname, String nachname, int alter, boolean fuehrerschein) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
        this.fuehrerschein = fuehrerschein;
    }

    public void sagHallo() {
        System.out.println("Hallo! Mein Name ist " + vorname + " " + nachname);
    }

    public void sagAlter() {
        System.out.println("Ich bin " + alter + " Jahre alt.");
    }

    public void hatFuehrerschein() {
        if(fuehrerschein) {
            System.out.println("Ich habe einen Führerschein.");
        }
        else {
            System.out.println("Ich habe noch keinen Führerschein");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", alter=" + alter +
                ", fuehrerschein=" + fuehrerschein +
                '}';
    }
}
