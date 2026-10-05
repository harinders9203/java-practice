    class node{
        int data;
        node next;

        public node(int d) {
            data=d;
            next=null;
        }
    }

    class op{
        node insert(node head,int data){
            node temp=new node(data);
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

        node insertatfront(node head,int data){
            node temp=new node(data);
            temp.next=head;
            return temp;
        }

       node inseratpos(node head, int data, int pos){
        node temp = new node(data);

        if(pos == 1){
            temp.next = head;
            return temp;
        }

        node ptr = head;

        for(int i = 1; i < pos-1 && ptr != null; i++){
            ptr = ptr.next;
        }

        if(ptr == null){
            System.out.println("Invalid position");
            return head;
        }

        temp.next = ptr.next;
        ptr.next = temp;

        return head;
}




        void display(node head){
            while(head!=null){
                System.out.print("n["+head.data+"|"+head.next+"]->\t");

                head=head.next;
            }
        }
    }

    public class linked_p2 {
        public static void main(String[] args){
            op n=new op();
            node head=null;


            head=n.insert(head, 1);
            head=n.insertatfront(head, 0);
            head=n.insert(head, 3);
            head=n.insert(head, 4);
            head=n.inseratpos(head, 5, 1);
            n.display(head);
        }   
    }