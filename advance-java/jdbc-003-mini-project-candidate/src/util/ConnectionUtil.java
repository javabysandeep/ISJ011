package util;

import constants.MysqlConstants;
import lombok.Getter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
    @Getter
    private static Connection connection;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(MysqlConstants.URL
                    , MysqlConstants.USERNAME, MysqlConstants.PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("unable to load the Driver");
        } catch (SQLException e) {
            System.out.println("SQL exception");
        }
    }
}
