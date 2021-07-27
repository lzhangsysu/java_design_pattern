package demo1.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private static Database instance = new Database();

    private Connection connection;

    private Database() {
    }

    public static Database getInstance() {
        return instance;
    }

    public void connect() throws Exception {
        if (connection != null)
            return;

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new Exception("Driver not Found");
        }

        String url = String.format("jdbc:mysql://localhost:%d/patterns", 3306);

        connection = DriverManager.getConnection(url, "squiffy", "letmein");
    }

    public void disconnect() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Can't close connection");
            }
        }

        connection = null;
    }
}
