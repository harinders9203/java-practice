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

        node ptr=head;

        while(ptr.next!=null){
            ptr=ptr.next;
        }

        ptr.next=temp;

        return head;
    }           

    void display(node head){

        while(head!=null){

            System.out.print(head.data+"->");

            // if(head.next!=null){
            //     System.out.print("->");
            // }

            head=head.next;
        }
    }
}

public class linked_p1 {

    public static void main(String[] args) {

        op n=new op();

        node head=null;

        head=n.insert(head,1);
        head=n.insert(head,2);
        head=n.insert(head,3);

        n.display(head);
    }
}