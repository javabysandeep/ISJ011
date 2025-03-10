import java.sql.*;
import java.util.Scanner;

public class Demo8PreparedStatementInsertIntoUserInput {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //01. load and register the Driver with DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        //02.get the connection from DriverManager by passing url, username, password
        Connection connection = DriverManager.getConnection(Constants.URL, Constants.USERNAME, Constants.PASSWORD);

        //03. create the Statement object to execute queries
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter candidate id");
        int id = scanner.nextInt();

        System.out.println("Enter candidate name");
        String name = scanner.nextLine();

        System.out.println("Enter candidate email");
        String email = scanner.nextLine();


        System.out.println("Enter candidate phone");
        String phone = scanner.nextLine();

        System.out.println("Enter candidate address");
        String address = scanner.nextLine();

        String sqlQuery = "insert into candidate(id, name, email, phone, address) values(?,?,?,?,?)";

        PreparedStatement ps = connection.prepareStatement(sqlQuery);
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setString(3, email);
        ps.setString(4, phone);
        ps.setString(5, address);

        //04. execute the query
        ps.executeUpdate();

        //05. close the connection
        connection.close();

        System.out.println("candidate added");
    }
}
