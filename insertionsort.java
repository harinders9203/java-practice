public class insertionsort {
    public static void main(String[] args) {

        int[] a = {5, 3, 8, 2};
        int n = a.length;

        for (int i = 1; i < n; i++) {

            int key = a[i];
            int j = i - 1;

            // shift elements
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }

            // insert element
            a[j + 1] = key;
        }

        // print array
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}