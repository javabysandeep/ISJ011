import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo9BatchInsertInto {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //01. load and register the Driver with DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        //02.get the connection from DriverManager by passing url, username, password
        Connection connection = DriverManager.getConnection(Constants.URL, Constants.USERNAME, Constants.PASSWORD);

        //03. create the Statement object to execute queries
        Statement statement = connection.createStatement();

        //04. execute the query
        String sqlQuery1 = "insert into candidate(id, name, email, phone, address) values(4,'Ganesh','Ganesh@gmail.com','XX XXXXXX','Pune')";
        String sqlQuery2 = "insert into candidate(id, name, email, phone, address) values(5,'Ganesh','Ganesh@gmail.com','XX XXXXXX','Pune')";
        String sqlQuery3 = "insert into candidate(id, name, email, phone, address) values(6,'Ganesh','Ganesh@gmail.com','XX XXXXXX','Pune')";
        String sqlQuery4 = "insert into candidate(id, name, email, phone, address) values(7,'Ganesh','Ganesh@gmail.com','XX XXXXXX','Pune')";
        String sqlQuery5 = "insert into candidate(id, name, email, phone, address) values(8,'Ganesh','Ganesh@gmail.com','XX XXXXXX','Pune')";

        statement.addBatch(sqlQuery1);
        statement.addBatch(sqlQuery2);
        statement.addBatch(sqlQuery3);
        statement.addBatch(sqlQuery4);
        statement.addBatch(sqlQuery5);

        statement.executeBatch();

        //05. close the connection
        connection.close();

        System.out.println("candidates added");
    }
}
