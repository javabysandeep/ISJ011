import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo7InsertIntoUsetInput {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //01. load and register the Driver with DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        //02.get the connection from DriverManager by passing url, username, password
        Connection connection = DriverManager.getConnection(Constants.URL, Constants.USERNAME, Constants.PASSWORD);

        //03. create the Statement object to execute queries
        Statement statement = connection.createStatement();

        //04. execute the query
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

        String sqlQuery = "insert into candidate(id, name, email, phone, address) " +
                "values(" + id + "," + "'" + name + "','" + email + "','" + phone + "','" + address + "')";
        statement.executeUpdate(sqlQuery);

        //05. close the connection
        connection.close();

        System.out.println("candidate added");
    }
}
