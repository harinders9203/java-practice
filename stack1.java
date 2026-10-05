class stack{
    int capacity;
    int top;
    int[] a;

    stack(int cap){
        capacity=cap;
        top=-1;
        a=new int[capacity];
    }


    void push(int e){
        if(top==capacity-1){
            System.out.println("stack overflow");
            return;
        }
        a[++top]=e;
    }

    int pop(){
        if(top==-1){
            System.out.println("Stack underflow");
            return -1;
        }

        return a[top--];
    }

    void display(){
        for (int i = 0; i <=top; i++) {
            System.out.println(a[i]);
        }
    }

}

public class stack1{
    public static void main(String[] args) {
        stack s=new stack(3);
        s.push(23);
        s.push(21);
        s.push(24);
        s.pop();
        // s.push(445);
        s.display();
        // System.out.println(s);
    }
}