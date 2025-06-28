import java.util.HashSet;

public class HashSetSample {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        hs.add("E");
        hs.add(null);// allows Null Values

        hs.forEach((v) -> {
            System.out.printf("Value: %s%n", v);
        });
    }
}
