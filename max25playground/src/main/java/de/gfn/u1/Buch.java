package de.gfn.u1;

public class Buch {

    public static void main(String[] args) {

        Aufgabe1 b1 = new Aufgabe1("Harry Potter", "J.K. Rowling", 750, 17.99);
        b1.buch1();

        System.out.println("---------------------------------------------------------------------------------------------------------------------");

        Aufgabe1 b2 = new Aufgabe1("Herr der Ringe", "J.R.R. Tolkien", 556, 19.99);
        b2.buch1();

        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        Aufgabe1 b3 = new Aufgabe1("Game of Thrones", "George R.R. Martin", 632, 16.99);
        b3.buch1();

        System.out.println("---------------------------------------------------------------------------------------------------------------------");

        Aufgabe1 b4 = new Aufgabe1("Narnia", "C.S. Lewis", 256, 12.99);
        b4.buch1();

        System.out.println("---------------------------------------------------------------------------------------------------------------------");

        Aufgabe1 b5 = new Aufgabe1("Flugangst", "Sebastian Fitzek", 337, 15.99);
        b5.buch1();
    }
}
