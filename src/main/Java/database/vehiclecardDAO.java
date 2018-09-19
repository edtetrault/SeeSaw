package database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class vehiclecardDAO {



        public void saveVehicleFlashcard(String vehicle_one, String vehicle_two, String vehicle_three, String vehicle_four, String vehicle_five, String vehicle_six) throws SQLException {
            Connection con = new DBConnector().getConn();
            PreparedStatement ps =
                    con.prepareStatement("INSERT INTO vehicle_cards (vehicle_one, vehicle_two, vehicle_three, vehicle_four, vehicle_five, vehicle_six) " + "VALUES (?, ?, ?, ?, ?, ?)");

            ps.setString(1, vehicle_one);
            ps.setString(2, vehicle_two);
            ps.setString(3, vehicle_three);
            ps.setString(4, vehicle_four);
            ps.setString(5, vehicle_five);
            ps.setString(6, vehicle_six);
            ps.executeUpdate();
        }

    }

