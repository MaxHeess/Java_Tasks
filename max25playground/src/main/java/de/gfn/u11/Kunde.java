package de.gfn.u11;

import java.util.Objects;

public class Kunde {
    private String name;
    private String email;

    public Kunde(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Überschreiben der equals() Methode, um den Inhalt der Objekte zu vergleichen
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Kunde kunde = (Kunde) obj;
        return Objects.equals(name, kunde.name) && Objects.equals(email, kunde.email);
    }

    // Überschreiben der hashCode() Methode, um konsistente Hash-Codes basierend auf dem Inhalt zu gewährleisten
    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }

    // Getter für Testzwecke
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
