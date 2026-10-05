class node{
  int node;
  node next;

    public node(int ele) {
      node=ele;
      next=null;
    }

}


class op{

  node insertion(node root,int ele){
    node temp=new node(ele);
    if(root==null){
      return temp;
    }
    node last=root;
    while(last.next!=null){
      last=last.next;
    }

    last.next=temp;
    return root;
  }

  void display(node root){
    while(root!=null){
      System.out.println(root.node);
      if(root.next!=null){
        System.out.println("->");

        root=root.next;
      }
    }
  }


}





public class linked_insertion {
  public static void main(String[] args) {
    int a[] = { 1, 2, 3, 4, 5 };

  }
}
