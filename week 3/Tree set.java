import java.util.TreeSet;
import java.util.Set;

public class Main{
    public static void main(String[] args){
        Set<Integer> n1=new TreeSet<>();
        n1.add(7);
        n1.add(8);
        n1.add(7);
        n1.add(87);

        System.out.println(n1);
        System.out.println(((TreeSet<Integer>)n1).first());
        System.out.println(((TreeSet<Integer>)n1).last());

    }
}