import java.sql.*;

public class Demo12CreateStoredProcedure {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //01. load and register the Driver with DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        //02.get the connection from DriverManager by passing url, username, password
        Connection connection = DriverManager.getConnection(Constants.URL, Constants.USERNAME, Constants.PASSWORD);

        //03. create the Statement object to execute queries
        String query = "create procedure bulk_insert()" +
                "begin " +
                "insert into candidate(name, email,phone, address) values('alpha','alpha@gmail.com','XXXXX','Pune');\n" +
                "insert into candidate(name, email,phone, address) values('beta','beta@gmail.com','XXXXX','Pune');\n" +
                "insert into candidate(name, email,phone, address) values('gama','gama@gmail.com','XXXXX','Pune');\n" +
                "" +
                "end";

        CallableStatement callableStatement = connection.prepareCall(query);

        //04. execute the query
        callableStatement.execute();
        System.out.println("stored procedure created");

        //05. close the connection
        connection.close();

    }
}
