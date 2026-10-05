
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class filewriteprac {
    public static void main(String[] args) {
        try{
            Scanner s1=new Scanner(System.in);
            FileWriter f=new FileWriter("test.txt",true);
            System.out.println("Enter the content: ");
            String co=s1.next();
            f.write("\n"+co);
            f.close();


            File file = new File("test.txt");
            Scanner s=new Scanner(file);
            while (s.hasNextLine()){
                // String d=s.nextLine();
                System.out.println(s.nextLine());
            }
            f.close();
        }
        catch(Exception e){
            System.out.println(".......");
        }
    }
}
