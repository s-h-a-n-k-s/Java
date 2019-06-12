package DB;
import java.sql.*;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/nationwide", "root", "root");
			statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery("select * from school");
			while (resultSet.next()) {
				System.out.println(resultSet.getString("regno") + " " + resultSet.getString("name") + " " + resultSet.getString("marks"));
			}
			resultSet.close();

			// statement.executeUpdate("insert into school values (1, 'Peter', 45)");
			
			statement.close();
			connection.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
        System.out.println("Hello World!");
    }
}
