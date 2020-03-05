import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> treeMap = new TreeMap<>();
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        createHashMap(treeMap);
        createHashMap(hashMap);
        createHashMap(linkedHashMap);
        displayHashMap(treeMap);
        displayHashMap(hashMap);
        displayHashMap(linkedHashMap);
    }

    private static void createHashMap(Map<String, Integer> hmap) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");// prompt for user input
        String input = scan.nextLine();
        // tokenize the input
        String[] tokens = input.split(" ");

        // processing the input text
        for (String token : tokens) {
            String word = token.toLowerCase();
            // if the map contains the word
            if (hmap.containsKey(word)) {
                int count = hmap.get(word);// to get value associated with word
                hmap.put(word, count + 1);
            } else {
                hmap.put(word, 1);
            }

        }

    }

    private static void displayHashMap(Map<String, Integer> hMap) {
        for (String str : hMap.keySet()) {
            System.out.println(str + " --> " + hMap.get(str));

        }
        System.out.println();
        System.out.println();
    }
}