import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Demo2CreateTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //01. load and register the Driver with DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        //02. Get the connection from DriverManager
        Connection connection = DriverManager.getConnection(Constants.URL, Constants.USERNAME, Constants.PASSWORD);

        //03. Create the Statement object to execute Query
        Statement statement = connection.createStatement();

        //04. execute the query
        statement.execute("create table book(id int primary key, name varchar(100), price int)");

        System.out.println("Book table created");
        //05. close the connection
        connection.close();
    }
}
