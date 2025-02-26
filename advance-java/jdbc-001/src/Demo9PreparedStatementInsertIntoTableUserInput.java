import java.sql.*;
import java.util.Scanner;


public class Demo9PreparedStatementInsertIntoTableUserInput {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //01. load and register the Driver with DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        //02. Get the connection from DriverManager
        Connection connection = DriverManager.getConnection(Constants.URL, Constants.USERNAME, Constants.PASSWORD);

        //03. Create the Statement object to execute Query
        //accept the values from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the book id");
        int id = scanner.nextInt();

        System.out.println("Enter the book price");
        int price = scanner.nextInt();

        System.out.println("Enter the book Name");
        String name = scanner.nextLine();

        String query = "insert into book(id, name, price) values(?,?,?)";

        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, id);
        statement.setString(2, name);
        statement.setInt(3, price);
        //04. execute the query


        statement.executeUpdate();

        System.out.println("record added in book table");
        //05. close the connection
        connection.close();
    }
}
