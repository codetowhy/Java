import java.util.Scanner;

public class AddTwoMatrix{
    public static void main(String[] args) {
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Values in First Matrix (3X3):");
            arr1 = InputMatrix(arr1, sc);
            System.out.println("Enter Values in Second Matrix (3X3):");
            arr2 = InputMatrix(arr2, sc);
        }

        System.out.println("First Matrix (3X3):");
        PrintMatrix(arr1);
        System.out.println("Second Matrix (3X3):");
        PrintMatrix(arr2);

        System.out.println("Sum of first and second Matrix (3X3):");
        MatrixSum(arr1,arr2);
    }

    private static int[][] InputMatrix(int[][] arr, Scanner sc) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    private static void PrintMatrix(int[][] matrix) {
      for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
            System.out.print(matrix[i][j] + " ");
         }
         System.out.println();
      }
   }

   private static void MatrixSum(int[][] arr1, int[][] arr2) {
      for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
            System.out.print(arr1[i][j] + arr2[i][j] + " ");
         }
         System.out.println();
      }
   }
}