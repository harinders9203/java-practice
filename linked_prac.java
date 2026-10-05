class node{
    int data;
    node next;
    node(int ele){
        data=ele;
        next=null;
    }
}

class op{
    node insert(node head,int ele){
        node temp=new node(ele);
        if(head==null){
            return temp;
        }
        node last=head;

        while(last.next!=null){
            last=last.next;

    }
    last.next=temp;
    return head;


}
void display(node head){
    while(head!=null){
        System.out.print(head.data);

        if(head.next!=null){
            System.out.print("->");
        }
        head=head.next;

    }
}
}
public class linked_prac {
    public static void main(String[] args) {
        op n=new op();

        node root=null;
        root=n.insert(root,1);
        root=n.insert(root,2);
        root=n.insert(root,3);
        n.display(root);


    }
}
