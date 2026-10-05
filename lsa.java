import java.util.Scanner;

public class lsa {
    public static void main(String[] args) {
        // int l,sm,i;
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        System.out.print("Enter the size of the array:");
        int s=sc.nextInt();
        for(int i=0;i<s;i++){
            System.out.print("Enter element at "+i+":");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<s;i++){
            System.out.println("Entered elements are a["+i+"]:"+a[i]);
        }
        int l=a[0],sm=a[0],i;
        for(i=0;i<s;i++){
            if (a[i]>l){
                l=a[i];
            }
            if (a[i]<sm){
                sm=a[i];
            }
        }
        System.out.println(l+" "+sm+"");























        // System.out.print("Enter the position you want to insert the elements: ");
        // int p=sc.nextInt();
        // System.out.print("Enter the element you want to insert at a["+p+"]:");
        // int e=sc.nextInt();
        // s++;
        // for(int i=s-1;i>=p;i--){
        //     a[i+1]=a[i];
        // }
        // a[p]=e;
        // for(int i=0;i<s;i++){
        //     System.out.println("Entered elements are a["+i+"]:"+a[i]);
        // }
    }
}
