import java.util.Queue;
import java.util.LinkedList;

public class Main{
    public static void main(String[] args){
        Queue<Integer> q1=new LinkedList<>();

        q1.add(20);
        q1.add(23);
        q1.add(76);

        System.out.println("elements present in queue are"+q1);

        int removed=q1.poll();

        System.out.println("The removed element is:"+removed);
        System.out.println("Front element:"+q1.peek());
        System.out.println("Queue is empty?"+q1.isEmpty());




    }
}

