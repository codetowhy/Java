public class recEvenOdd {
    public static void main(String[] args) {

        System.out.println("Printing Even Numbers :");        
        PrintEvenNumber(50);

        System.out.println();

        System.out.println("Printing Odd Numbers :");
        PrintOddNumber(50);    
    }

    private static void PrintEvenNumber(int n) {
        if (n >= 0)
            PrintEvenNumber(n - 1);
        System.out.print(n % 2 == 0 ? n : " ");
    }

    private static void PrintOddNumber(int n) {
       if (n > 0)
            PrintOddNumber(n - 1);
        System.out.print(n % 2 != 0 ? n : " ");
    }
}
