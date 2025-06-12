public class SumOfArrayItems {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 2, 5, 2, 6, 8, 3, 0 };
        int sum = 0;

        for(int item : arr){
            sum = sum + item;
        }

        System.out.printf("Sum of Array : %d", sum);
    }
}
