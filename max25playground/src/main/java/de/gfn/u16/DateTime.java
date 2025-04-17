package de.gfn.u16;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTime {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Datum + Uhrzeit: ");
        String eingabe = scanner.nextLine();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss.SSS");
        LocalDateTime eingegebenesDatum = LocalDateTime.parse(eingabe, fmt);
        System.out.println(eingegebenesDatum);

    }
}
