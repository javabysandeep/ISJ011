import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo14CallStoredProcedure {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //01. load and register the Driver with DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        //02.get the connection from DriverManager by passing url, username, password
        Connection connection = DriverManager.getConnection(Constants.URL, Constants.USERNAME, Constants.PASSWORD);

        //03. create the Statement object to execute queries
        String query = "call bulk_insert();";

        CallableStatement callableStatement = connection.prepareCall(query);

        //04. execute the query
        callableStatement.execute();
        System.out.println("stored procedure executed");

        //05. close the connection
        connection.close();

    }
}
