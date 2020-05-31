import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateStrFrmFiles72 {
    public static void main(String[] args) {
        try {
            File f = new File("./test.txt");
            Scanner scan = new Scanner(f);
            List<String> s = new ArrayList<>();
            while (scan.hasNextLine()) {
                s.add(scan.nextLine());
            }
            System.out.println(s);
            for (String str:s) {
                System.out.println("**"+str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

