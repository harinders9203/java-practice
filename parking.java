import java.util.Scanner;

class product {

    private int id;
    private String name;
    private double price;
    private double rating;

    public product(int id, String name, double price, double rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;

    }

    void display() {
        System.out.println("Product id:" + id);
        System.out.println("Product name:" + name);
        System.out.println("price:" + price);
        System.out.println("rating of product:" + rating);
    }

    int get_id() {
        return id;
    }

    String get_name() {
        return name;

    }
     

    // void linearsearch(product[] p,int sID,int s){
    //     boolean flag=false;
    //     for (int i = 0; i <=s; i++) {
    //         if (p[i].id==sID) {
    //             flag=true;
    //             p[i].display();
    //             break;
    //         } else {
    //             System.out.println("element not found");
    //         }
    //     }
    // }
}

public class parking {
    void bubblesort(product[] p, int s) {
        for (int i = 0; i < s-1; i++) {
            for (int j = 0; j < s - i - 1; j++) {
                if (p[j].get_id() > p[j + 1].get_id()) {
                    product temp = p[j];
                    p[j]= p[j + 1];
                    p[j + 1] = temp;
                }
            }
        }
            System.out.println("Your sorted product list are:");
        for (int i = 0; i <=s; i++) {
            p[i].display();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int s = 0;
        product[] p = new product[100];
        int num;
        String na;
        double pr;
        double ra;

        for (int i = 0; i < p.length; i++) {

            System.out.println("Do u want to add products or not");
            String st = sc.nextLine();

            if (st.equals("y")) {

                System.out.println("enter your product id");
                num = sc.nextInt();

                sc.nextLine();
                System.out.print("enter your product name:");
                na = sc.nextLine();

                System.out.print("enter your product price:");
                pr = sc.nextDouble();

                System.out.print("enter your rating:");
                ra = sc.nextDouble();

                sc.nextLine();

                p[i] = new product(num, na, pr, ra);
            } else {
                System.out.println("thanks for using");
                break;
            }

        s++;
        }



        System.out.println("your entered products are:-\n");
        for (int j = 0; j <= s; j++) {
            p[j].display();
            System.out.println("\n");
        }



        
        System.out.println("Press 1 for searching / Press 2 for sorting");
        int operation = sc.nextInt();

        if (operation == 1) {
            System.out.print("enter your product name u want to search:");
            String str = sc.nextLine();
            boolean flag = false;
            for (int i = 0; i <= s; i++) {
                if (p[i].get_name() == str) {
                    flag = true;

                    p[i].display();
                    break;
                }
            }
            if (flag == false) {
                System.out.println("element not found");
            }

        } else if (operation == 2) {
            ecommerce ob = new ecommerce();
            ob.bubblesort(p, s);
        }
        sc.close();
    }
}

// }else if (operation==2) {
//     System.out.println("enter 1 (bubble sort) / enter 2 (selection sort)");
// }
