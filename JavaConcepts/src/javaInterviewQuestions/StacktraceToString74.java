import java.io.PrintWriter;
import java.io.StringWriter;

public class StacktraceToString74 {
    public static void main(String[] args) {
        try {
            int i = 2/0;
        }catch (Exception e){
            e.printStackTrace();
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);
            System.out.println("*****"+sw.toString());
        }
    }
}
