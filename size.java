
import java.util.Scanner;

class area{
    int length;
    int breadth;
    void display(){
        int aog=length*breadth;
        System.out.println("Area of given shape is: "+aog);
    }
}
public class size {
    public static void main(String[] args) {
        area a=new area();
        Scanner s1=new Scanner(System.in);
        a.length=s1.nextInt();
        a.breadth=s1.nextInt();
        a.display();
    }
}
