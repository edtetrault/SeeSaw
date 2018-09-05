package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnector {
    private Connection conn;
    public DBConnector() {
        try {
            this.conn =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306" +
            "user=root&password=2015Larry!");

        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

    }

    public Connection getConn() {
        return this.conn;
    }


}
