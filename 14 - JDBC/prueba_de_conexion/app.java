// package prueba_de_conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class app {

    private static String MYSQL_JDBC_DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
    private static String MYSQL_DB_URL = "jdbc:mysql://localhost:3306/nba";
    private static String MYSQL_DB_USER = "root";
    private static String MYSQL_DB_USER_PASSWORD = "qwerty1241";
    private static String SQL_QUERY = "select * from jugador";

    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection(MYSQL_DB_URL, MYSQL_DB_USER, MYSQL_DB_USER_PASSWORD)) {

            Class.forName(MYSQL_JDBC_DRIVER_CLASS);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL_QUERY);

            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1));
            }

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL Driver class not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error occured while executing query: " + SQL_QUERY);
            e.printStackTrace();
        }
    }

}
