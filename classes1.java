class car{
    String brand;
    int model;
    void display(){
        System.out.println("Car Brand: "+ brand);
        System.out.println("Car model: "+ model);
    }
}
public class classes1{
    public static void main(String[] args){
        car c1=new car();
        c1.brand="Toyata";
        c1.model=2023;
        c1.display();
    }
}