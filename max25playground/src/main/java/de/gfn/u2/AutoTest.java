package de.gfn.u2;

public class AutoTest {

    public static void main(String[] args) {

        Auto a1 = new Auto("WN-JG-548", "VW", "Golf");
        a1.fahreKm(-222);
        System.out.println(a1);
    }
}
