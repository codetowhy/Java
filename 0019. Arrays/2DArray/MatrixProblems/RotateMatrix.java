public class RotateMatrix {
   public static void main(String[] args) {
      /* Rotating Matrix by 90 Degree
       Input:
        1 2 3
        4 5 6
        7 8 9
       Output:
        7 4 1
        8 5 2
        9 6 3
       */
      int[][] matrix = new int[3][3];
      int counter = 1;

      // Inserting values into 3X3 Matrix
      for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
            matrix[i][j] = counter++;
         }
      }

      // Values Before Rotation of Matrix
      System.out.println("Values Before Rotation of Matrix:");
      PrintMatrix(matrix);

      // Step 1: Transpose the matrix
      for (int i = 0; i < 3; i++) {
         for (int j = i; j < 3; j++) {
            // Swap elements at [i][j] and [j][i]
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
         }
      }

      // Step 2: Reverse each row
      for (int i = 0; i < 3; i++) {
         int start = 0, end = 3 - 1;
         while (start < end) {
            // Swap elements in row
            int temp = matrix[i][start];
            matrix[i][start] = matrix[i][end];
            matrix[i][end] = temp;
            start++;
            end--;
         }
      }

      // Values After Rotation of Matrix
      System.out.println("Values After Rotation of Matrix:");
      PrintMatrix(matrix);
   }

   private static void PrintMatrix(int[][] matrix) {
      for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
            System.out.print(matrix[i][j] + " ");
         }
         System.out.println();
      }
   }
}
