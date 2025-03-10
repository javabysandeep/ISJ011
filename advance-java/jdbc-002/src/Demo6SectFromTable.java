import java.sql.*;

public class Demo6SectFromTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //01. load and register the Driver with DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        //02.get the connection from DriverManager by passing url, username, password
        Connection connection = DriverManager.getConnection(Constants.URL, Constants.USERNAME, Constants.PASSWORD);

        //03. create the Statement object to execute queries
        Statement statement = connection.createStatement();

        //04. execute the query
        String sqlQuery = "select * from candidate";
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id") + "\t" +
                    resultSet.getString("name") + "\t" +
                    resultSet.getString("email") + "\t" +
                    resultSet.getString("phone") + "\t" +
                    resultSet.getString("address")
            );
        }

        //05. close the connection
        connection.close();

    }
}
