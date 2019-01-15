import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExperiment {
    public static void main(String args[]) {
        sum();
    }

    public static void filter() {
        List<String> strs = new ArrayList<String>();
        strs.add("one");
        strs.add("two");
        strs.add("three");
        Predicate<String> p1 = e -> e.equals("two");
        Predicate<String> p2 = e -> e.equals("one");
        Predicate<String> p = p1.or(p2);

        List<String> three = strs.stream().filter(p).collect(Collectors.toList());
        System.out.println(strs);
        System.out.println(three);
    }

    public static void sum() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);

        list.stream().reduce(0, (a, b) -> {System.out.println(a + " : " + b); return a+b;});
    }
}
