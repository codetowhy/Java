import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        String input;
        String text1 = "hello";
        String text2 = "Hello";

        System.out.print("Enter any string value :");
        try(Scanner sc = new Scanner(System.in)){
            input = sc.nextLine();
        }

        //Concatenate in the end of input
        System.out.println(input.concat(" Hello"));

        //Using Substring with Begin and end index
        System.out.println(input.substring(0, 3));

        //Using Substring with Begin index
        System.out.println(input.substring(1));        

        //Compare string content with case-sensitivity
        System.out.println(text1.equals(text2));

        //Compare string content without case-sensitivity
        System.out.println(text1.equalsIgnoreCase(text2));

        //Return Character at specified index
        System.out.println(text1.charAt(4));

        //Return Index of specified Character
        System.out.println(text1.indexOf("l"));

        //Return Index value -1 if specified Character doesn't exist
        System.out.println(text1.indexOf("zz"));

        //Return Index from end of string of specified character
        System.out.println(text1.lastIndexOf("he"));
    }
}
