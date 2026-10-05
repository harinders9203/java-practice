
import java.io.File;
import java.util.Scanner;

public class fileread {
    public static void main(String[] args) {
        try {
         File f=new File("test.txt");
        Scanner sc=new Scanner(f);
        while (sc.hasNextLine()){
            String data=sc.nextLine();
            System.out.println(data);
        }
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
}
