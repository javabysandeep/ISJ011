import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Demo3DropTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //01. load and register the Driver with DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        //02. Get the connection from DriverManager
        Connection connection = DriverManager.getConnection(Constants.URL, Constants.USERNAME, Constants.PASSWORD);

        //03. Create the Statement object to execute Query
        Statement statement = connection.createStatement();

        //04. execute the query
        statement.execute("drop table book");

        System.out.println("Book table dropped");
        //05. close the connection
        connection.close();
    }
}
