package de.gfn.u6;

import java.util.Arrays;

public class WuerfelTest {

    public static void main(String[] args) {

        System.out.println(Wuerfel.roll());
        System.out.println(Wuerfel.roll());

        int[] arr = Wuerfel.roll(100);

        System.out.println(Arrays.toString(arr));

        for (int zahl : arr) {
            System.out.println(zahl);
        }
    }
}
