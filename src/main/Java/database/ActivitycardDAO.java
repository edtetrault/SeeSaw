package database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ActivitycardDAO {



        public void saveActivityFlashcard(String activity_one, String activity_two, String activity_three, String activity_four, String activity_five, String activity_six) throws SQLException {
            Connection con = new DBConnector().getConn();
            PreparedStatement ps =
                    con.prepareStatement("INSERT INTO activity_cards (activity_one, activity_two, activity_three, activity_four, activity_five, activity_six) " + "VALUES (?, ?, ?, ?, ?, ?)");

            ps.setString(1, activity_one);
            ps.setString(2, activity_two);
            ps.setString(3, activity_three);
            ps.setString(4, activity_four);
            ps.setString(5, activity_five);
            ps.setString(6, activity_six);
            ps.executeUpdate();
        }

    }

