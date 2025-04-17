package de.gfn.u16;

import java.time.Duration;
import java.time.Instant;

public class TimeTrackingSingleton {

    private static TimeTrackingSingleton instance;
    private Instant startZeit;
    private Instant endZeit;
    private Instant pauseStart;
    private Duration gesamtPause = Duration.ZERO; // Gesamtzeit der Pausen

    private TimeTrackingSingleton() {} // Privater Konstruktor für Singleton

    public static TimeTrackingSingleton getInstance() {
        if (instance == null) {
            instance = new TimeTrackingSingleton();
        }
        return instance;
    }

    public void start() {
        if (startZeit == null) {
            startZeit = Instant.now();
            System.out.println("Zeiterfassung gestartet!");
        } else {
            System.out.println("Die Zeiterfassung läuft bereits.");
        }
    }

    public void startPause() {
        if (startZeit != null && pauseStart == null) {
            pauseStart = Instant.now();
            System.out.println("Pause gestartet.");
        } else if (pauseStart != null) {
            System.out.println("Die Zeiterfassung ist bereits pausiert.");
        } else {
            System.out.println("Fehler: Du musst zuerst 'start' eingeben!");
        }
    }

    public void endePause() {
        if (pauseStart != null) {
            Duration pauseDauer = Duration.between(pauseStart, Instant.now());
            gesamtPause = gesamtPause.plus(pauseDauer);
            pauseStart = null;
            System.out.println("Pause beendet.");
        } else {
            System.out.println("Es läuft keine Pause.");
        }
    }

    public void ende() {
        if (startZeit != null) {
            endZeit = Instant.now();
            Duration dauer = Duration.between(startZeit, endZeit).minus(gesamtPause);

            long stunden = dauer.toHours();
            long minuten = dauer.toMinutes() % 60;

            System.out.println("Zeiterfassung beendet!");
            System.out.println("Arbeitszeit: " + stunden + " Stunden und " + minuten + " Minuten (Pausenzeit: " + gesamtPause.toMinutes() + " Minuten)");

            // Zurücksetzen für eine neue Messung
            startZeit = null;
            endZeit = null;
            pauseStart = null;
            gesamtPause = Duration.ZERO;
        } else {
            System.out.println("Fehler: Du musst zuerst 'start' eingeben!");
        }
    }
}
