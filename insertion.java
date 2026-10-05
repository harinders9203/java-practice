public class insertion {
    public static void main(String[] args) {
        int a[]={5,3,8,2,1};
        int n=a.length;
        for(int i=1;i<n;i++){
            int k=a[i];
            int j=i-1;
            while (j>=0&&a[j]>k) {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=k;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}