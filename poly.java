class cal{
    void add(int a,int b){
        System.out.println((a+b));
    }
    void add(int a,int b,int c){
        System.out.println((a+b+c));
    }
}
class cal1 extends cal{
    void add(int a,int b){
        System.err.println((a*b));
    }
}
public class poly {
    public static void main(String[] args) {
        cal a=new cal();
        a.add(21,11);
        a.add(21, 33, 76);
        cal1 a1=new cal1();
        a1.add(34, 2);
    }
}
