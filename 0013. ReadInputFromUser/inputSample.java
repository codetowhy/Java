import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class inputSample {
    public static void main(String[] args) throws IOException {

        //Using BufferedReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter any string value: ");
        String str = reader.readLine();

        System.out.print("Enter any integer value: ");
        int num = Integer.parseInt(reader.readLine());

        System.out.println("String: "+str);
        System.out.println("Integer: "+num);

        //Using In-built Scanner function
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter any one word: ");
        String strWord = scn.next();
        scn.nextLine();//to skip enter pressed

        System.out.print("Enter any full sentence: ");
        String strSentence = scn.nextLine();

        System.out.print("Enter any integer value: ");
        num = scn.nextInt();

        scn.close();

        System.out.println("One word string: "+strWord);
        System.out.println("Full Sentence string: "+strSentence);
        System.out.println("Integer: "+num);
    }
}
