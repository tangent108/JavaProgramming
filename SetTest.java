import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();// can be used
        TreeSet<Integer> ts = new TreeSet<>(); // maintains set insorted order.
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
        String[] colors = { "yellow", "green", "black", "cyan", "tan", "grey", "white", "orange", "red", "green" };
        TreeSet<String> stree = new TreeSet<>(Arrays.asList(colors));
        LinkedHashSet<String> lhtree = new LinkedHashSet<>(Arrays.asList(colors));
        HashSet<String> htree = new HashSet<>(Arrays.asList(colors));
        printArray(colors);
        printTreeSet(stree);
        printLinkedHashSet(lhtree);
        printHashSet(htree);
        System.out.println(htree.contains("red"));

        stree.iterator();

        System.out.println("The head set of red : " + stree.headSet("red"));
        System.out.println("The tail set of red : " + stree.tailSet("red"));
        System.out.println(stree.remove("green"));
        stree.clear();
        System.out.println(stree);

    }

    public static void printTreeSet(TreeSet<String> tset) {
        System.out.print("The Tree Set : ");
        for (String s : tset) {
            System.out.printf("%s, ", s);
        }
        System.out.println();
    }

    public static void printHashSet(HashSet<String> hset) {
        System.out.print("The Hash Set : ");
        for (String s : hset)
            System.out.printf("%s, ", s);
        System.out.println();
    }

    public static void printLinkedHashSet(LinkedHashSet<String> lhset) {
        System.out.print("The Linked Hash Set : ");
        for (String s : lhset)
            System.out.printf("%s, ", s);
        System.out.println();
    }

    public static void printArray(String[] arr) {
        System.out.print("The array elements : ");
        for (String s : arr) {
            System.out.printf("%s, ", s);
        }
        System.out.println();
    }
}