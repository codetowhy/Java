public class recSample1 {
    public static void main(String[] args) {
        PrintNumberStartingFromOne(10);
    }
    private static void PrintNumberStartingFromOne(int n) {
        if (n > 1)
            PrintNumberStartingFromOne(n - 1);
        System.out.print(n + " ");
    }
}