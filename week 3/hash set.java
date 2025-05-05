import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> colour = new HashSet<>();

        colour.add("Red");
        colour.add("White");
        colour.add("Purple");
        System.out.println("The colours that are present in hash set are:" + colour);
        System.out.println("the set contain red colour?:" + colour.contains("White"));
        colour.remove("Red");
        System.out.println("After removing the remaining colour are:" + colour);

    }
}