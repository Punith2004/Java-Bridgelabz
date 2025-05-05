import java.util.HashSet;
import java.util.Set;
public class Main{
    public static void main(String[] args){
        Set<Integer> numbers=new HashSet<>();
        numbers.add(45);
        numbers.add(76);
        numbers.add(87);

        System.out.println("The numbers present in hashset are:"+numbers);
        numbers.remove(87);
        System.out.println("After removing number from hashset"+numbers);

    }
}