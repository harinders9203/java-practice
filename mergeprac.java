public class mergeprac {
    public static void divide(int a[],int lb,int ub){
        int mid=(lb+ub)/2;
        if(lb>=ub){
            return;
        }
        divide(a, lb, mid);
        divide(a, mid+1, ub);
        conquer(a, lb, ub, mid);
    }

    public static void conquer(int a[],int lb,int ub,int mid){
        int m[]=new int[ub-lb+1];
        int l=lb;
        int r=mid+1;
        int k=0;
        while(l<=mid&&r<=ub){
            if(a[l]<=a[r]){
                m[k]=a[l];
                l++;
            } else{
                m[k]=a[r];
                r++;
            }
            k++;
        }

        while(l<=mid){
            m[k]=a[l];
            l++;
            k++;
        }

        while(r<=mid){
            m[k]=a[r];
            r++;
            k++;
        }


        for (int i = 0; i < m.length; i++) {
            a[lb+i]=m[i];
        }

    }


    public static void main(String[] args) {
        int a[]={5,4,3,2,1};
        divide(a, 0, a.length-1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    
}
