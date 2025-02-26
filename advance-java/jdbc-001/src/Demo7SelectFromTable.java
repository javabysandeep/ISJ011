import java.sql.*;


public class Demo7SelectFromTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //01. load and register the Driver with DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        //02. Get the connection from DriverManager
        Connection connection = DriverManager.getConnection(Constants.URL, Constants.USERNAME, Constants.PASSWORD);

        //03. Create the Statement object to execute Query
        Statement statement = connection.createStatement();

        //04. execute the query
        ResultSet resultSet = statement.executeQuery("select * from book");

        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id")
                    + "\t" + resultSet.getString("name")
                    + "\t" + resultSet.getInt("price")
            );
        }

        //05. close the connection
        connection.close();
    }
}
