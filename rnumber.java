import java.util.Scanner;

public class rnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 4 digit number:");
        String a=sc.nextLine();
        // String a="2345";
        String r="";
        int l=a.length();
        for(int i=l-1;i>=0;i--){
            r+=a.charAt(i);
        }
        System.out.println(r);
    }
}
