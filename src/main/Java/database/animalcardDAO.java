package database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class animalcardDAO {



        public void saveAnimalFlashcard(String animals_one,String animals_two, String animals_three, String animals_four, String animals_five, String animals_six) throws SQLException {
            Connection con = new DBConnector().getConn();
            PreparedStatement ps =
                    con.prepareStatement("INSERT INTO animal_cards (animals_one, animals_two, animals_three, animals_four, animals_five, animals_six) " + "VALUES (?, ?, ?, ?, ?, ?)");

            ps.setString(1, animals_one);
            ps.setString(2, animals_two);
            ps.setString(3, animals_three);
            ps.setString(4, animals_four);
            ps.setString(5, animals_five);
            ps.setString(6, animals_six);
            ps.executeUpdate();
        }

    }

