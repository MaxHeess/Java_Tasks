package de.gfn;

public class PersonenTest {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.vorname = "Peter";
        p1.nachname = "Parker";
        p1.alter = 25;
        p1.fuehrerschein = true;
        p1.sagHallo();
        p1.sagAlter();
        p1.hatFuehrerschein();

        System.out.println();

        Person p2 = new Person("Bruce", "Banner", 46, false);
        p2.sagHallo();
        p2.sagAlter();
        p2.hatFuehrerschein();

        System.out.println();

        Person p3 = new Person("Carol", "Danvers", 32, true);
        p3.sagHallo();
        p3.sagAlter();
        p3.hatFuehrerschein();


        System.out.println();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
