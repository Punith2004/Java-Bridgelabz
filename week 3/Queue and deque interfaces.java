import java.util.PriorityQueue;
import java.util.Queue;

public class Main{
   public static void main(String[] args){
       Queue<Integer> numbers=new PriorityQueue<>();

       numbers.offer(6);
       numbers.offer(9);
       numbers.offer(5);
       numbers.offer(4);

       System.out.println("Priority Queue: " + numbers);
       System.out.println("Peek: " + numbers.peek());
       System.out.println("Poll: " + numbers.poll());
       System.out.println("After poll: " + numbers);

   }

}