import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo2ReadPropertiesFile {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Work\\ISJ011\\advance-java\\jdbc-004-mini-project-properpeties\\src\\application.properties");
        FileInputStream fileInputStream = new FileInputStream(file);
        Properties properties = new Properties();
        properties.load(fileInputStream);
        System.out.println(properties);
        String url = properties.getProperty("mysql.database.url");
        String username = properties.getProperty("mysql.database.username");
        String password = properties.getProperty("mysql.database.password");
        System.out.println("url " + url);
        System.out.println("username " + username);
        System.out.println("password " + password);

    }
}
