package com.itshaala.util;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@AllArgsConstructor
@Component
@PropertySource("classpath*:application.properties")
public class ConnectionUtil {

    private Environment env;

    public Connection getConnection() {
        Connection connection = null;
        String url = env.getProperty("mysql.url");
        String username = env.getProperty("mysql.username");
        String password = env.getProperty("mysql.password");
        String driver = env.getProperty("mysql.driver");

        if (connection == null) {
            try {
                Class.forName(driver);
                connection = DriverManager.getConnection(url, username, password);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return connection;
    }
}
