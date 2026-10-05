class animal{
    void sound(){
        System.out.println("sound...");
    }
}
class dog extends animal{
    void sound(){
        System.out.println("barking...");
    }
}
class cat extends animal{
    void sound(){
        System.out.println("meow...");
    }
}
public class moverr{
    public static void main(String[] args) {
        dog d=new dog();
        d.sound();
        animal a=new animal();
        a.sound();

    }
}