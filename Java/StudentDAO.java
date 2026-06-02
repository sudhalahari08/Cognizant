import java.sql.*;

public class StudentDAO{

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/school",
                "root",
                "password"
            );

            PreparedStatement insert =
                con.prepareStatement(
                    "INSERT INTO students VALUES (?,?)"
                );

            insert.setInt(1,103);
            insert.setString(2,"Priya");

            insert.executeUpdate();

            PreparedStatement update =
                con.prepareStatement(
                    "UPDATE students SET name=? WHERE id=?"
                );

            update.setString(1,"Lahari");
            update.setInt(2,103);

            update.executeUpdate();

            System.out.println("Insert & Update Successful");

            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}