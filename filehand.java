
import java.io.File;

public class filehand {
    public static void main(String[] args) {
        try {
            
            File f=new File("test.txt");
            if (f.createNewFile()){
                System.out.println("New file created "+f.getName());
            }
            else{
                System.out.println("File already exists.");
            }
        } catch (Exception e) {
            System.out.println("Something went wrong....");
        }


    }
}
