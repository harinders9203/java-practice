public class pop {

    static int stack[] = {10, 20, 30, 0, 0};
    static int top = 2;

    static void pop() {

        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Removed: " + stack[top]);
            top--;
        }
    }

    public static void main(String[] args) {

        pop();

        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
    }
}