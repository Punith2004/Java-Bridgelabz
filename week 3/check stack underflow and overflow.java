public class Main {
    private int[] stack;
    private int top;
    private int capacity;

    public Main(int size) {
        stack = new int[size];
        capacity = size;
        top =-1;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("The stack is overflow");
            return;
        }
        stack[++top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("The stack is underflow:");
            return -1;
        }
        return stack[top--];
    }

    public boolean isFull() {
        return top==capacity-1;
    }

    public boolean isEmpty() {
        return top == -1;
    }


    public static void main(String[] args) {
        Main stack = new Main(3);

        stack.push(20);
        stack.push(30);
        stack.push(34);


        stack.pop();
        stack.pop();
        stack.pop();

    }
}


