class node{
    int ele;
    node addr;
    node(int d){
        ele=d;
        addr=null;
    }
}
class op{
    node insert(node head,int el){
        node temp=new node(el);
        if(head==null){
            return temp;
        }
        node ptr=head;
        while (ptr.addr!=null) {
            ptr=ptr.addr;
        }
        ptr.addr=temp;
        return head;
    }

    void display(node head){
        while(head!=null){
            System.out.print("a["+head.ele+"|"+head.addr+"]->");
            head=head.addr;
        }
    }
}

public class linked_p3{
    public static void main(String[] args) {
        op n=new op();
        node head=null;
        head=n.insert(head, 1);
        head=n.insert(head, 3);
        head=n.insert(head, 2);
        n.display(head);
    }
}