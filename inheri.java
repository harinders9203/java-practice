class animal{
    void eat(){
        System.out.print("Eating....");
    }
}
class dog extends animal{
    void sound(){
        System.out.print("Barking...");
    }
}
class inheri{
    public static void main(String[] args) {
        dog d=new dog();
        d.sound();
        d.eat();

    }
}