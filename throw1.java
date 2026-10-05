import java.util.Scanner;

public class throw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 value:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if (b==0){
            throw new ArithmeticException("Division by zero is not allowed.");

        }
        else{
            System.out.println(a/b);
        }
    }
    
}
