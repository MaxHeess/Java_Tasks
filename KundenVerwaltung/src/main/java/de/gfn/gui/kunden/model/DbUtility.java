package de.gfn.gui.kunden.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtility {

    private static final String URL = "jdbc:mysql://localhost:3306/usermanagement";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    private DbUtility() {

    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
