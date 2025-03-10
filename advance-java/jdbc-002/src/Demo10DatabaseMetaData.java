import java.sql.*;

public class Demo10DatabaseMetaData {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //01. load and register the Driver with DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        //02.get the connection from DriverManager by passing url, username, password
        Connection connection = DriverManager.getConnection(Constants.URL, Constants.USERNAME, Constants.PASSWORD);


        // get the information about the database
        DatabaseMetaData databaseMetaData = connection.getMetaData();
        System.out.println("driver name : " + databaseMetaData.getDriverName());
        System.out.println("database url: " + databaseMetaData.getURL());
        System.out.println("database username: " + databaseMetaData.getUserName());
        System.out.println("database username max length: " + databaseMetaData.getMaxUserNameLength());


        //05. close the connection
        connection.close();

    }
}
