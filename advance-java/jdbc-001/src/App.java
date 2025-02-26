import java.sql.*;

public class App {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // connect to the database
        //get the data from course table and print
        // APP --> JDBC --->Connector ----> DB

        //01. load and register the Driver with DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        //02. Get the Connection from DriverManager
        String username = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/isj011";
        Connection connection = DriverManager.getConnection(url, username, password);

        //03. execute the query
        Statement statement = connection.createStatement();
        String query = "select * from courses";
        ResultSet resultSet = statement.executeQuery(query);

        //04. use the resultSet
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id")
                    + "\t" + resultSet.getString("name")
                    + "\t" + resultSet.getInt("price")
                    + "\t" + resultSet.getString("duration")
            );
        }

        //05. close the connection
        resultSet.close();


    }
}
