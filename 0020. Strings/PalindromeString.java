public class PalindromeString {
    public static void main(String[] args) {
        String text = "adbtatbda";
        System.out.println(isPalindrome(text));
    }

    private static String isPalindrome(String input) {
        int leftIndex = 0;
        int rightIndex = input.length() - 1;

        while (leftIndex < rightIndex) {
            if (input.charAt(leftIndex) != input.charAt(rightIndex))
                return "Not Palindrome";
            leftIndex++;
            rightIndex--;
        }
        return "Palindrome";
    }
}
