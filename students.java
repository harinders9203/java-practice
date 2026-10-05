class sdata{
    String name;
    int rn;
    void display(){
        System.out.println("Name= " +name);
        System.out.println("Roll no: "+rn);
    }
}
public class students {
    public static void main(String[] args) {
    sdata s=new sdata();
    s.name="HS";
    s.rn=124;
    s.display();
    }
}
