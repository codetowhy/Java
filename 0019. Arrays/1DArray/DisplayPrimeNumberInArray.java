public class DisplayPrimeNumberInArray {
    public static void main(String[] args) {
        int[] arr = { 1, 6, 8, 2, 9, 3, 64, 21, 7, 11, 24, 13 };

        for (int item : arr) {
            int count = 0;
            for (int i = 1; i <= item; i++) {
                if (item % i == 0)// Incrementing the count every time value is fully divisible
                    count++;
            }
            if (count == 2 || item == 1)// Printing the number only if it divisbility count is exactly 2 times making it
                                        // a prime number.
                System.out.print(item + " ");
        }
    }
}
