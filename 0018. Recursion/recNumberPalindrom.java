import java.util.Scanner;

public class recNumberPalindrom {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Input a Number to check if it is Palindrome : ");
            int input = in.nextInt();

            if (input == ReversingNumber(input, 0))
                System.out.print("Input given is Palindrome Number.");
            else
                System.out.print("Input given is not Palindrome Number.");
        }
    }

    private static int ReversingNumber(int n, int temp) {

        temp = (n % 10) + (temp * 10);

        if (n / 10 > 0)
            return ReversingNumber((n / 10), temp);
        else
            return temp;
    }
}
