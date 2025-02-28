import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo1ReadPropertiesFile {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Work\\ISJ011\\advance-java\\jdbc-004-mini-project-properpeties\\src\\application.properties");
        FileInputStream fileInputStream = new FileInputStream(file);
        int read = fileInputStream.read();
        while (read != -1) {
            System.out.print((char) read);
            read = fileInputStream.read();
        }
        fileInputStream.close();

    }
}
