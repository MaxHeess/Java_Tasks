package de.gfn.datenbanken;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLiteTest {

    public static void main(String[] args) {

        try(Connection verbindung = SQLiteUtils.getConnection();
            Statement stmt = verbindung.createStatement()) {

            stmt.execute("CREATE TABLE IF NOT EXISTS benutzer (" +
                    "id INTEGER," +
                    "vorname TEXT NOT NULL," +
                    "nachname TEXT NOT NULL," +
                    "PRIMARY KEY(id AUTOINCREMENT))");

            System.out.println("Fertig!");
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
