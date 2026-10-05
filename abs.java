class std{
    private String name;
    void set(String n){
        name=n;
    }
    void display(){
        System.out.println("The name of student is "+name);
    }

}
public class abs {
   public static void main(String[] args) {
       std a=new std();
       a.set("Harinder");
       a.display();
   }
}
