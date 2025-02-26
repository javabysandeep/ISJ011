import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Demo8InsertIntoTableUserInput {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //01. load and register the Driver with DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        //02. Get the connection from DriverManager
        Connection connection = DriverManager.getConnection(Constants.URL, Constants.USERNAME, Constants.PASSWORD);

        //03. Create the Statement object to execute Query
        Statement statement = connection.createStatement();

        //04. execute the query
        //accept the values from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the book id");
        int id = scanner.nextInt();

        System.out.println("Enter the book price");
        int price = scanner.nextInt();

        System.out.println("Enter the book Name");
        String name = scanner.nextLine();

        String query = "insert into book(id, name, price) values(" + id + "," + "'" + name + "'," + price + ")";
        statement.executeUpdate(query);

        System.out.println("record added in book table");
        //05. close the connection
        connection.close();
    }
}
