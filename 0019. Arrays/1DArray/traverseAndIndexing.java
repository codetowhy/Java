public class traverseAndIndexing {
    public static void main(String[] args) {
        // Array Declaration
        int[] arr;

        // Array Memory Allocation
        arr = new int[5];

        // Value initialization & Traversing
        for (int i = 0; i < 5; i++) {
            arr[i] = i + 1;
        }

        // Fetching Values
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}