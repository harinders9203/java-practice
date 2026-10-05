public class inserprac {
    public static void main(String[] args) {
        int a[]={5,4,3,2,1};
        int k;
        for (int i = 0; i < a.length; i++) {
            k=a[i];
            int j=i-i;
            while (j>=0&&a[j]>k) {
                a[j+1]=a[j];
                j--;
            }
        } 
    }
    
}
