import java.util.Scanner;

public class try1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter 1st variable:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a/b);
        } catch (Exception p) {
            System.out.println("Something went wrong.....");
        } finally {
            System.out.println("Code execution is completed");
        }
    }
}
