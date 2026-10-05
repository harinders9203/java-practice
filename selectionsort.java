public class selectionsort{
    public static void main(String[] args) {
        int a[]={3,1,5,2,4};
        int s=a.length;
        for (int i = 0; i < s-1;i++) {
            int min=i;
            for (int j = i+1; j < s; j++) {
                if(a[min]<a[j]){
                    min=j;
                }
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }

        for (int i = 0; i < s; i++) {
            System.out.println(a[i]);
        }
    }
}
