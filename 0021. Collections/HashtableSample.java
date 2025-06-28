import java.util.Hashtable;

public class HashtableSample {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
        ht.put(1, "A");
        ht.put(2, "B");
        ht.put(3, "C");
        ht.put(4, "D");
        ht.put(4, "D - Duplicate"); // Duplicate Key value will override previous value
        ht.put(5, "E");
        // ht.put(6, null); Null Values are not allowed

        ht.forEach((k, v) -> {
            System.out.printf("Key: %d Value: %s%n", k, v);
        });
    }
}
