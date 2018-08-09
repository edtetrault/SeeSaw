package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class LoadDatabase {
    Connection conn = null;

    public LoadDatabase() {
        try {
            conn =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306?" +
                            "user=root&password=2015Larry!");


        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

    }

    public Connection getConn() {
        return conn;
    }
}

