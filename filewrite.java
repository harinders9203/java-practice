import java.io.FileWriter;

public class filewrite{
    public static void main(String[] args) {
        try {
            FileWriter f=new FileWriter("test.txt");
            f.write("This is a testing file");
            f.close();
        }
         catch (Exception e) {
System.out.println("Something went wrong..");
    }
}
}