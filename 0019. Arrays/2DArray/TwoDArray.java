public class TwoDArray {
    public static void main(String[] args) {
        //Declaring 2-D Array
        int[][] arr;

        //Allocating Memory to 2-D Array
        arr = new int[3][3];

        //Inserting values in 2-D Array
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]=i+j;
            }
        }

        //Displaying values from 2-D Array
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
