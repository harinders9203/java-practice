import java.util.*;
public class bubblesort {
    public static void main(String[] args) {
        int a[]={5,2,1,4,3};
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    // int temp;
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i=0;i<a.length-1;i++){
            System.out.println(a[i]);
        }
    }
}
