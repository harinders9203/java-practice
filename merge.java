public class merge{
    public static void conquer(int a[], int si, int ei, int mid){
        int m[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(a[i]<a[j]){
                m[k]=a[i];
                i++;
            }
            else{
                m[k]=a[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            m[k]=a[i];
            i++;
            k++;
        }
        while(j<=ei){
            m[k]=a[j];
            j++;
            k++;
        }
        for(int x=0, y=si; x<m.length; x++, y++){
            a[y]=m[x];
        }
    }
    public static void divide(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = si + (ei-si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, ei, mid);
    }
    public static void main(String[] args) {
        int a[]={5,4,1,3,2};
        divide(a, 0, a.length-1);
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}