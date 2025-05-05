import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> name=new LinkedList<>();

        name.add("apple");
        name.add("orange");
        name.add("grapes");

        System.out.println("The fruits present in list are:" + name);
        System.out.println("The last element in list are:" + name.getLast());
        System.out.println("The first element in list are:" + name.getFirst());


    }
}