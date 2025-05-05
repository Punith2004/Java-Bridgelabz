import java.util.*;

public class Main{
    public static void main(String[] args){
        Set<Integer> s1=new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> s2=new HashSet<>(Arrays.asList(4,2,1));

        boolean check=s1.equals(s2);

        System.out.print(check);
    }
}