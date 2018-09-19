package database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PersoncardDAO {



        public void savePersonFlashcard(String people_one, String people_two, String people_three, String people_four, String people_five, String people_six) throws SQLException {
            Connection con = new DBConnector().getConn();
            PreparedStatement ps =
                    con.prepareStatement("INSERT INTO people_cards (people_one, people_two, people_three, people_four, people_five, people_six) " + "VALUES (?, ?, ?, ?, ?, ?)");

            ps.setString(1, people_one);
            ps.setString(2, people_two);
            ps.setString(3, people_three);
            ps.setString(4, people_four);
            ps.setString(5, people_five);
            ps.setString(6, people_six);
            ps.executeUpdate();
        }

    }

