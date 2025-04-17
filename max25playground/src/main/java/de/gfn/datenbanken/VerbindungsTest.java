package de.gfn.datenbanken;

import java.sql.*;

public class VerbindungsTest {

    public static void main(String[] args) {

        try (Connection verbindung = DbUtility.getConnection();
            Statement stmt = verbindung.createStatement()) {

            ResultSet daten = stmt.executeQuery("SELECT * FROM kunden");

            while (daten.next()) {
                System.out.println(daten.getString("vorname") + " " + daten.getString("nachname"));
            }
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
