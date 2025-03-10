import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1CreateTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //01. load and register the Driver with DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        //02.get the connection from DriverManager by passing url, username, password
        Connection connection = DriverManager.getConnection(Constants.URL, Constants.USERNAME, Constants.PASSWORD);

        //03. create the Statement object to execute queries
        Statement statement = connection.createStatement();

        //04. execute the query
        String sqlQuery = "create table candidate(id int primary key, name varchar(100), email varchar(100), phone varchar(50), address varchar(100))";
        statement.execute(sqlQuery);

        //05. close the connection
        connection.close();

        System.out.println("candidate table is created");
    }
}
