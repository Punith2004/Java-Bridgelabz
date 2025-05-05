import java.util.Stack;
public class Main{
    public static void main(String[] args){
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(23);
        stack.push(45);

        System.out.println("elements present in stack are:"+stack);

        System.out.println("the top element is:"+stack.peek());

        System.out.println("popeed elements:"+stack.pop());

        System.out.println("The stack is empty:"+stack.empty());


    }
}
