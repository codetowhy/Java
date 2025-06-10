public class ArrSample {
    public static void main(String[] args) {

        //Non-primitive Data Types -
        int[] arr = {1, 2, 4, 5, 2, 1, 5, 6, 9, 2};

        int[] brr;
        brr = arr;

        System.out.println("Items in array arr: ");
        for (int item : arr) {
            System.out.print(item + " ");
        }

        System.out.println();
        System.out.println("Items in array brr: ");
        for (int item : brr) {
            System.out.print(item + " ");
        }

        System.out.println();
        System.out.println();

        //changes to item at index [2] of Array arr will affect Array brr
        // because both are pointing to same memory in Heap
        arr[2] = 45;

        System.out.println("Items in array arr: ");
        for (int item : arr) {
            System.out.print(item + " ");
        }

        System.out.println();
        System.out.println("Items in array brr: ");
        for (int item : brr) {
            System.out.print(item + " ");
        }

    }
}
