public class graph_basics {
    public static void main(String[] args) {
        int[][] a={
                {0,1,1,0,0},
                {1,0,0,1,1},
                {1,0,0,0,1},
                {0,1,0,0,1},
                {0,1,1,1,0}
        };
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}