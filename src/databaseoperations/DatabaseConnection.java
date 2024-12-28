package databaseoperations;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:sqlite:database.db"; // SQLite için dosya tabanlı

    public static Connection connect() {
		try {
			return DriverManager.getConnection(URL);
		} catch (SQLException e) {
			System.out.println("Connection failed: " + e.getMessage());
			return null;
		}
    }
}
