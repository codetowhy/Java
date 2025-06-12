public class ArraySorting {
    public static void main(String[] args) {
        //Declaring and Initializing array with Unsorted values.
        int[] arr = { 23, 4, 12, 3, 5, 1, 34, 8, 45, 92, 12 };

        //Comparing each item with other items using Nested Loop
        for(int i =0; i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                //If item prior in the sequence is greater then Swapping their positions
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        //Displaying each values of Array after Sorting
        for(int item : arr){
            System.out.print(item+" ");
        }
    }
}
