
import java.io.FileWriter;


public class fileappend {
    public static void main(String[] args) {
        try {
            FileWriter f=new FileWriter("test.txt",true);
            f.write("now its appended");
            f.close();
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
}
