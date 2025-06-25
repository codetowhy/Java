import java.util.Scanner;

public class MinMax {
    static int[][] arr = new int[3][3];
    static int min, max;

    public static void main(String[] args) {
        System.out.println("Insert value in 2-D Array:");
        try (Scanner sc = new Scanner(System.in)) {
            inputArray(sc);
        }
        Min();
        System.out.printf("Minimum Value in 2-D Array: %d%n", min);
        Max();
        System.out.printf("Maximum Value in 2-D Array: %d", max);
    }

    private static void inputArray(Scanner sc) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    private static void Min() {
        min = arr[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
    }

    private static void Max() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
    }
}
