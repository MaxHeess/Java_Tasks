package de.gfn.u16;

import java.util.Scanner;

public class Zeiterfassung {

    public static void main(String[] args) {

        TimeTrackingSingleton tracker = TimeTrackingSingleton.getInstance();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Gebe einen Befehl ein (start / start_pause / ende_pause / ende): ");
            String eingabe = scanner.nextLine().trim().toLowerCase();

            switch (eingabe) {
                case "start":
                    tracker.start();
                    break;
                case "start_pause":
                    tracker.startPause();
                    break;
                case "ende_pause":
                    tracker.endePause();
                    break;
                case "ende":
                    tracker.ende();
                    break;
                default:
                    System.out.println("Ungültiger Befehl! Nutze 'start', 'start_pause', 'ende_pause' oder 'ende'.");
            }
        }
    }
}
