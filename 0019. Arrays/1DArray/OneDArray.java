public class OneDArray {
    public static void main(String[] args) {
        // Array Declaration & Initializatopm
        int[] arr = { 2, 3, 84, 52, 16, 78 };

        // Printing length of 1-D Array
        System.out.printf("Array Length : %d%n", arr.length);

        // Modifying value of 1-D Array at index 3
        arr[3] = 12 * 2;

        // displaying value of 1-D Array using different types of loops
        System.out.println("Using While Loop :");
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
        
        System.out.println();
        System.out.println("Using For Loop :");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("Using Foreach Loop :");
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}