import java.util.Scanner;

public class switchSample2 {
     public static void main(String[] args)
    {
      try (Scanner in = new Scanner(System.in)) {
        System.out.print("Input a number to check if even or odd: ");
        int input = in.nextInt();

        switch (input%2) {
            case 0:
                System.out.println("Even");
                break;                
            default:
               System.out.println("Odd");
                break;
        }
      }
    }
}
