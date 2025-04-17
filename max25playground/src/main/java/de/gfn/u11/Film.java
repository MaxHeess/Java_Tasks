package de.gfn.u11;

import java.util.Objects;

public class Film {
    private String title;
    private String director;

    public Film(String title, String director) {
        this.title = title;
        this.director = director;
    }

    // Überschreiben der equals() Methode, um den Inhalt der Objekte zu vergleichen
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Film film = (Film) obj;
        return Objects.equals(title, film.title) && Objects.equals(director, film.director);
    }

    // Überschreiben der hashCode() Methode, um konsistente Hash-Codes basierend auf dem Inhalt zu gewährleisten
    @Override
    public int hashCode() {
        return Objects.hash(title, director);
    }

    // Getter für Testzwecke
    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }
}