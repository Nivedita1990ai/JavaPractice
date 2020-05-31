import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AppendFIle73 {
    public static void main(String[] args) {
        try {
            String s = "\nAnd I am doomed in Azkaban.";
            FileOutputStream fo = new FileOutputStream(".//test.txt", true);
            byte[] strBytes = s.getBytes();
            fo.write(strBytes);
            fo.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
