package core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {// Singleton Desing Pattern
    private static Db instance = null;
    private Connection connection = null;
    private final String DB_URL = "jdbc:postgresql://localhost:5432/RentaCar";
    private final String DB_USERNAME ="postgres";
    private final String DB_PASS ="postgre";

    private Db() {
        try {
            this.connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/RentaCar","postgres","postgre");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public Connection getConnection() {
        return connection;
    }
    public static Connection getInstance (){

        try {
            if (instance==null || instance.getConnection().isClosed()){
                instance = new Db();

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return instance.getConnection();
    }

}