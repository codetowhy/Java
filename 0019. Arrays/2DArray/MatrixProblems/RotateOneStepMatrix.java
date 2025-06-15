public class RotateOneStepMatrix {
public static final int totalRows   = 3;
public static final int totalCols   = 3;
    public static void main(String[] args) {
    /* Rotating Matrix by 1-step Degree    
    Input : 3 X 3 Matrix :
        1 2 3
        4 5 6
        7 8 9
    Output :
        4 1 2
        7 5 3
        8 9 6
    
    Input: 4 X 4 Matrix :
         1  2  3  4
         5  6  7  8
         9 10 11 12
        13 14 15 16
    Output:
         5  1  2  3
         9 10  6  4
        13 11  7  8
        14 15 16 12
       */
      int[][] matrix = new int[totalRows][totalCols];
      int counter = 1;

      // Inserting values into Matrix
      for (int i = 0; i < totalRows; i++) {
         for (int j = 0; j < totalCols; j++) {
            matrix[i][j] = counter++;
         }
      }     

      // Values Before Rotation of Matrix
      System.out.println("Values Before Rotation of Matrix:");
      PrintMatrix(matrix);

      StepRotation(matrix,totalRows,totalCols);

      // Values After Rotation of Matrix
      System.out.println("Values After Rotation of Matrix:");
      PrintMatrix(matrix);
    }

    private static int[][] StepRotation(int mat[][],int m, int n){
      int row = 0, col = 0;
        int prev, curr;

        /*
        row - Starting row index
        m - ending row index
        col - starting column index
        n - ending column index
        i - iterator
        */
        while (row < m && col < n) {

            if (row + 1 == m || col + 1 == n)
                break;

            // Store the first element of next row, this element will replace first element of current row
            prev = mat[row + 1][col];

            // Move elements of first row one at a time
            for (int i = col; i < n; i++) {
                curr = mat[row][i];
                mat[row][i] = prev;
                prev = curr;
            }            
            //By end of above loop value of last element of first row will be in "prev"
            row++; // Moving to next row

            System.out.println("Matrix after element from first row are moved");
            PrintMatrix(mat);

            // Move elements of last column from the remaining columns
            for (int i = row; i < m; i++) {
                curr = mat[i][n - 1];
                mat[i][n - 1] = prev;
                prev = curr;
            }
            n--;

            System.out.println("Matrix after element of last column are moved");
            PrintMatrix(mat);

            // Move elements of last row one at a time
            if (row < m) {
                for (int i = n - 1; i >= col; i--) {
                    curr = mat[m - 1][i];
                    mat[m - 1][i] = prev;
                    prev = curr;
                }
            }
            m--;

            System.out.println("Matrix after element of last row are moved");
            PrintMatrix(mat);

            // Move elements of first column one at a time
            if (col < n) {
                for (int i = m - 1; i >= row; i--) {
                    curr = mat[i][col];
                    mat[i][col] = prev;
                    prev = curr;
                }
            }
            col++;

            System.out.println("Matrix after element of first column are moved");
            PrintMatrix(mat);
        }

        return mat;
    }

    private static void PrintMatrix(int[][] matrix) {
      for (int i = 0; i < totalRows; i++) {
         for (int j = 0; j < totalCols; j++) {
            System.out.print(matrix[i][j] + "  ");
         }
         System.out.println();
      }
   }
}
