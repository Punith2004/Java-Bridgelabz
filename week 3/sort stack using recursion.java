import java.util.Stack;
public class Main{
    static void insertedSorted(Stack<Integer>stack,int element) {
        if (stack.isEmpty() || element < stack.peek()) {
            stack.push(element);
            return;
        }


        int temp = stack.pop();
        insertedSorted(stack, element);
        stack.push(temp);
    }




    static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            sortStack(stack);
            insertedSorted(stack, temp);
        }
    }

    public static void main(String[] args){
        Stack<Integer> stack=new Stack<>();

        stack.push(98);
        stack.push(76);
        stack.push(65);
        stack.push(34);

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

}