
import java.util.Scanner;

class Student {
    String name;
    int age;
    Student(){
        System.out.println("Enter student's data first name then age");
    }

    // Student(String n, int a) {
    //     name = n;
    //     age = a;
    // }

    void display() {
        System.out.println(name + " " + age);
    }
}

public class tesr {
    public static void main(String[] args) {
        Student s1 = new Student();
        Scanner sc=new Scanner(System.in);
        s1.name=sc.nextLine();
        s1.age=sc.nextInt();
        s1.display();
    }
}