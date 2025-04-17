package de.gfn.datenbanken;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteUtils {

    private static final String URL = "jdbc:sqlite:~daten.db";

    private SQLiteUtils() {

    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL);
    }
}
