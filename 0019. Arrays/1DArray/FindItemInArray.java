import java.util.Scanner;

public class FindItemInArray {
    public static void main(String[] args) {
        int[] arr = { 23, 4, 2, 75, 21, 87, 21, 90, 3, 67 };

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Input a Number to search from list :");
            int input = sc.nextInt();

            for (int item : arr) {
                if (input == item) {
                    System.out.print("Value is present in Array.");
                    System.exit(0);
                    ;
                }
            }
            System.out.print("Value is not present in Array.");
        }
    }
}
