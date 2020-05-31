import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FileToByteArrayVV75 {
    public static void main(String[] args) {
        try {
            String path = ".//test.txt";
            byte[] bt = Files.readAllBytes(Paths.get(path));
            System.out.println(Arrays.toString(bt));

            path = ".//test1.txt";
            File f = new File(path);
            f.createNewFile();
            Files.write(Paths.get(path),bt);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
