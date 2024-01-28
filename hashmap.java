import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating HashMap using keys and values with Generics
        // Creating object for map
        Map<Integer, String> hash = new HashMap<>();

        // Insertion()
        // Key-values user Define value
        hash.put(1, "AI");
        hash.put(2, "ML");
        hash.put(3, "CSD");

        // Assigning the key for Hashing
        System.out.println("Value for key 2: " + hash.get(2));
        System.out.println("Value for key 3: " + hash.get(3));

        // Print all the values of key
        System.out.println("HashMap: " + hash);

        // Deletion
        hash.remove(1);

        // Print the values after remove()
        System.out.println("After Removal of key 1: " + hash);
    }
}
