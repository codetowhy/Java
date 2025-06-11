import java.util.Scanner;

public class recArmstrong {
    public static void main(String[] args) {
       try (Scanner in = new Scanner(System.in)) {
        System.out.print("Input a Number to check if it is Armstrong : ");
        int input = in.nextInt();
        
        if(input == IsArmStrongNumber(input))
            System.out.print("Input given is Armstrong Number.");
        else
            System.out.print("Input given is not Armstrong Number.");
       }
    }

    private static int IsArmStrongNumber(int n) {
        if (n > 0)
            return (int)(Math.pow(n%10, 3)) + IsArmStrongNumber((n / 10));
        else
            return 0;
    }
}
