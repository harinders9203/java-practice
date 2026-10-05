public class quick{

    static int partition(int a[],int l,int h){
        int pivot=a[h];
        int i=l-1;
        for (int j = l; j < h; j++) {
            if(a[j]<pivot){
                i++;
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }

        int t=a[i+1];
        a[i+1]=a[h];
        a[h]=t;
        return i+1;
    }

    static void quicksort(int a[],int l,int h){
        if (l<h){
            int pi=partition(a, l, h);
            quicksort(a, l, pi-1);
            quicksort(a, pi+1, h);
        }
    }



    public static void main(String[] args) {
        int a[] = {5, 3, 8, 2};
        quicksort(a, 0, a.length-1);
       for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}