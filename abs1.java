class std{
    protected String name;
    void setName(String n){
        name=n;
    }
    String getName(){
        return name;
    }
}
class marks extends std{
    private int marks;
    void setNum(int m){
        marks=m;
    }
    void getval(){
        System.out.println("The name of the student is "+name+" and marks are: "+marks);
    }
}

public class abs1 {
 public static void main(String[] args) {
    marks m=new marks();
    m.setName("Harinder");
    m.setNum(45);
    m.getval();
 }
}
