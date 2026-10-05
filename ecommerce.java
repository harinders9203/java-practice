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

    double get_price() {
        return price;
    }

    double get_rating() {
        return rating;
    }
}

public class ecommerce {

    void bubblesort(product[] p, int s) {
        for (int i = 0; i < s - 1; i++) {
            for (int j = 0; j < s - i - 1; j++) {
                if (p[j].get_id() > p[j + 1].get_id()) {
                    product temp = p[j];
                    p[j] = p[j + 1];
                    p[j + 1] = temp;
                }
            }
        }
        System.out.println("Your sorted product list are:");
        for (int i = 0; i < s; i++) {
            p[i].display();
        }
    }

    void selectionsort(product[] p, int s) {
        for (int i = 0; i < s - 1; i++) {
            int min = i;
            for (int j = i + 1; j < s; j++) {
                if (p[min].get_price() > p[j].get_price()) {
                    min = j;
                }
            }
            product temp = p[i];
            p[i] = p[min];
            p[min] = temp;

        }
        System.out.println("Your sorted product list are:");
        for (int i = 0; i < s; i++) {
            p[i].display();
        }
    }

    void divide(product[] p, int lb, int ub) {
        int mid = (lb + ub) / 2;
        if (lb >= ub) {
            return;
        }
        divide(p, lb, mid);
        divide(p, mid + 1, ub);
        conquer(p, lb, mid, ub);

    }

    void conquer(product[] p, int lb, int mid, int ub) {
        product[] b = new product[ub - lb + 1];
        int l = lb;
        int u = mid + 1;
        int c = 0;
        while (l <= mid && u <= ub) {
            if (p[l].get_rating() > p[u].get_rating()) {
                b[c] = p[l];
                l++;
            } else {
                b[c] = p[u];
                u++;
            }
            c++;
        }
        while (l <= mid) {
            b[c] = p[l];
            l++;
            c++;
        }
        while (u <= ub) {
            b[c] = p[u];
            u++;
            c++;
        }
        for (int i = 0; i < b.length; i++) {
            p[lb + i] = b[i];
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int s = 5;
        product[] p = new product[100];
        int num;
        String na;
        double pr;
        double ra;
        boolean flag = false;
        boolean flag1=true;


        p[0] = new product(2, "mobile", 10000, 4.5);
        p[1] = new product(1, "laptop", 50000, 4.7);
        p[2] = new product(4, "tv", 25000, 4.3);
        p[3] = new product(3, "headphones", 2000, 4.0);
        p[4] = new product(5, "camera", 15000, 4.2);

        System.out.println("your entered products are:-\n");
        for (int j = 0; j < s; j++) {
            p[j].display();
            System.out.println("\n");
        }

        int ch1;
        do {
            System.out.println("Do u want to add more products press 1 or press 2 for No");
            ch1 = sc.nextInt();
            if (ch1 == 1) {
                if (s < p.length) {
                    System.out.println("Enter your product id");
                    num = sc.nextInt();
                    sc.nextLine();
                    System.out.print("enter your product name:");
                    na = sc.nextLine();
                    System.out.print("enter your product price:");
                    pr = sc.nextDouble();
                    System.out.print("enter your rating:");
                    ra = sc.nextDouble();
                    p[s] = new product(num, na, pr, ra);
                    s++;
                } else {
                    System.out.println("you have already added the maximum number of products");
                }

                System.out.println("Do u want to add more products press 1 or press 2 for No");
                int flg = sc.nextInt();
                if (flg == 1) {
                    flag1 = true;
                    ch1 = 1;
                } else if (flg == 2) {
                    flag1 = false;
                    ch1 = 2;
                } else {
                    System.out.println("put valid input");
                    flag1 = true;
                }
            } else if (ch1 == 2) {
                flag1 = false;
            } else {
                System.out.println("put valid input");
                flag1 = true;
            }
        } while (flag1);
        if (ch1 == 2) {
        System.out.println("Press 1 for searching / Press 2 for sorting");
        int operation = sc.nextInt();

        if (operation == 1) {

            System.out.print("enter your product name u want to search:");
            String sna = sc.nextLine();
            sna = sc.nextLine();
            for (int k = 0; k < s; k++) {
                if (p[k].get_name().equals(sna)) {
                    System.out.println("your product is:");
                    p[k].display();
                    flag = true;
                }
            }
            if (flag == false) {
                System.out.println("element not found");
            }

        } else if (operation == 2) {
            ecommerce ob = new ecommerce();
            System.out.println("press 1 for id_wise sort / press 2 for price_wise sort/ press 3 for rating_wise sort");
            int sorttype = sc.nextInt();
            if (sorttype == 1) {
                ob.bubblesort(p, s);
            } else if (sorttype == 2) {
                ob.selectionsort(p, s);
            } else if (sorttype == 3) {
                System.out.println("3rd called");
                ob.divide(p, 0, s - 1);
                for (int i = 0; i < s; i++) {
                    p[i].display();
                }
            }

        } else {
            System.out.println("put valid input");
        }

        }
    }
}