interface animal{
    void walk();
}
interface bird{
    void fly();
}
class type implements animal,bird{
    String name;
    public type(String n) {
        name=n;
    }

    public void walk(){
        System.out.println(name+" can walk");
    }
    public void fly(){
        System.out.println(name+" can fly");
    }
}

public class intr {
    public static void main(String[] args) {
        type t=new type("eagle");
        t.fly();

    }
}
