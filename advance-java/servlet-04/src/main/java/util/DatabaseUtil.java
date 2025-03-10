package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static constants.DbConstants.DRIVER_NAME;
import static constants.DbConstants.USERNAME;
import static constants.DbConstants.URL;
import static constants.DbConstants.PASSWORD;

public class DatabaseUtil {
    private static Connection connection;

    static {
        try {
            Class.forName(DRIVER_NAME);
        } catch (ClassNotFoundException e) {
            System.out.println("unable to load the driver");
        }
    }

    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            } catch (SQLException e) {
                System.out.println("unable to connect");
            }
        }
        return connection;
    }

}
