import java.sql.*;

public class Demo11ResultSetMetaData {
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

        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
        System.out.println("column count = "+resultSetMetaData.getColumnCount());
        System.out.println("Table name for given column = "+resultSetMetaData.getTableName(1));
        System.out.println("is auto increment : "+resultSetMetaData.isAutoIncrement(1));

        //05. close the connection
        connection.close();

    }
}
