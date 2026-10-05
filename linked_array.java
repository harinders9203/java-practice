class node{
    int data;
    node next;

    public node(int d) {
        data=d;
        next=null;
    }

    void display(){
        System.out.println("data is:"+data+"\naddress is:"+next);
    }
}



public class linked_array {
    public static void main(String[] args) {
        node n1=new node(12);
        node n2=new node(22);
        node n3=new node(13);
        n1.next=n2;
        n2.next=n3;
        n1.display();
        n2.display();
        n3.display();
    }
}
