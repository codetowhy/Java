import java.util.HashMap;

public class HashMapSample {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "A");
        hm.put(2, "B");
        hm.put(3, "C");
        hm.put(4, "D");
        hm.put(4, "D - Duplicate"); // Duplicate Key value will override previous value
        hm.put(5, "E");
        hm.put(6, null);// Null Values are allowed

        hm.forEach((k, v) -> {
            System.out.printf("Key: %d Value: %s%n", k, v);
        });
    }
}
