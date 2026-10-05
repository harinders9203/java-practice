class qu1{
    int[] a;
    int f;
    int r;
    int c;
    public qu1(int s) {
        c=s;
        a=new int[c];
        f=0;
        r=-1;
    }


    void enque(int e){
        if(r==c-1){
            System.out.println("Queue is full");
            return;
        }
        else{
            r++;
            a[r]=e;
            System.out.println("Given element inserted:" +e);
        }
    }


    void deque(){
        if(f>r){
            System.out.println("Queue is empty");
        }

        else{
            System.out.println("Value is deleted");
            f++;
        }
    }


    void display(){
        for(int i=f;i<=r;i++){
            System.out.println("elements are: "+a[i]);
        }
    }



}
public class queue {
    public static void main(String[] args) {
        qu1 q=new qu1(3);
        q.enque(12);
        q.enque(34);
        q.enque(43);
        q.deque();
        q.display();
    }
}