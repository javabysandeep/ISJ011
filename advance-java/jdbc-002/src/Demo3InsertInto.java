import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo3InsertInto {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //01. load and register the Driver with DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        //02.get the connection from DriverManager by passing url, username, password
        Connection connection = DriverManager.getConnection(Constants.URL, Constants.USERNAME, Constants.PASSWORD);

        //03. create the Statement object to execute queries
        Statement statement = connection.createStatement();

        //04. execute the query
        String sqlQuery = "insert into candidate(id, name, email, phone, address) values(2,'Ganesh','Ganesh@gmail.com','XX XXXXXX','Pune')";
        statement.executeUpdate(sqlQuery);

        //05. close the connection
        connection.close();

        System.out.println("candidate added");
    }
}
