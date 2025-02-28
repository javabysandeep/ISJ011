package util.Connection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {
    private static Connection connection;
    private static String url;
    private static String username;
    private static String password;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            File file = new File("C:\\Work\\ISJ011\\advance-java\\jdbc-004-mini-project-properpeties\\src\\application.properties");
            FileInputStream fileInputStream = new FileInputStream(file);
            Properties properties = new Properties();
            properties.load(fileInputStream);
            url = properties.getProperty("mysql.database.url");
            username = properties.getProperty("mysql.database.username");
            password = properties.getProperty("mysql.database.password");
        } catch (ClassNotFoundException e) {
            System.out.println("driver not found");
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection() {
        try {
            connection = (connection == null) ?
                    DriverManager.getConnection(url, username, password)
                    : connection;
        } catch (SQLException e) {
            System.out.println("invalid credentials");
        }
        return connection;
    }
}
