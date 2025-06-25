public class Pangram {
    public static void main(String[] args) {
        String text1 = "The quick brown fox jumps over the lazy dog";
        System.out.println(isPangram(text1));

        String text2 = "The quick brown fox jumps over the dog";
        System.out.println(isPangram(text2));
    }

    private static String isPangram(String input) {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (input.toLowerCase().indexOf(ch) == -1)
                return "Not Pangram";
        }
        return "Pangram";
    }
}
