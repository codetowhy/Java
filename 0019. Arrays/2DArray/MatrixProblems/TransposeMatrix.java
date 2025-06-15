public class TransposeMatrix {
    public static void main(String[] args) {
        /* Rotating Matrix by 90 Degree
            Input:
                1 2 3
                4 5 6
                7 8 9
            Output:
                1 4 7 
                2 5 8 
                3 6 9 
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

      // Transpose the matrix
      for (int i = 0; i < 3; i++) {
         for (int j = i; j < 3; j++) {
            // Swap elements at [i][j] and [j][i]
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
         }
      }

      // Values After Rotation of Matrix
      System.out.println("Values After Transpose of Matrix:");
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
