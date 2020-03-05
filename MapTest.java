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

/*
input as 

Enter a string:
a  Hazal another different is sample sentence is sample sentence this with words with this words hazal
Enter a string:
a  Hazal another different is sample sentence is sample sentence this with words with this words hazal
Enter a string:
a  Hazal another different is sample sentence is sample sentence this with words with this words hazal


Output:

 --> 1
a --> 1
another --> 1
different --> 1
hazal --> 2
is --> 2
sample --> 2
sentence --> 2
this --> 2
with --> 2
words --> 2


 --> 1
sentence --> 2
a --> 1
with --> 2
another --> 1
this --> 2
words --> 2
is --> 2
hazal --> 2
different --> 1
sample --> 2


a --> 1
 --> 1
hazal --> 2
another --> 1
different --> 1
is --> 2
sample --> 2
sentence --> 2
this --> 2
with --> 2
words --> 2


*/
