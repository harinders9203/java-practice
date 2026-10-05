import java.io.File;

public class fileprac {
    public static void main(String[] args) {
        try {
            File f=new File("test.txt");
            System.out.println(f.createNewFile());
            // if(f.createNewFile()){
            //     System.out.println("File is created");
            // }
            // else{
            //     System.err.println("File already existed...");
            // }
        } catch (Exception e) {
            System.out.println("Something went wrong...");
        }
    }
}
