import java.util.*;

public class SortedSetTest {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();// can be used
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(4);
        ts.add(8);
        ts.add(6);
        ts.add(2);
        System.out.println(ts.contains(8));
        System.out.println(ts);
        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println(ts.headSet(6));
        ts.remove(4);
        System.out.println(ts);
        if (!ts.isEmpty()) {
            System.out.println("No set is not empty");
        } else {
            System.out.println("Set is empty");

        }
        System.out.println("The Size of set is " + ts.size());
        // creating TreeSet from array of colors
        String[] colors = { "yellow", "green", "black", "cyan", "tan", "grey", "while", "orange", "red", "green" };
        TreeSet<String> tree = new TreeSet<>(Arrays.asList(colors));
        printSet(tree);
        tree.iterator();

        System.out.println("The head set of red : " + tree.headSet("red"));
        System.out.println("The tail set of red : " + tree.tailSet("red"));
        System.out.println(tree.remove("green"));

    }

    public static void printSet(TreeSet<String> set) {
        for (String s : set) {
            System.out.printf("%s, ", s);
        }
        System.out.println();
    }
}