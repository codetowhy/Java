public class ReverseString {
    public static void main(String[] args) {
        String text = "Hello World";
        String reverseText ="";

        int i=text.length()-1;
        while (i>=0) {
            reverseText = reverseText + text.charAt(i);
            i--;
        }
        System.out.println(reverseText);
    }
}
