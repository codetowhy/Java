public class allDataTypesFormatted {
    public static void main(String[] args) {
        // Variables of different types
        int integer = 42;
        float floatingPoint = 3.14f;
        double doubleValue = 3.14159;
        char character = 'A';
        String string = "Hello, world!";
        long largeNumber = 1234567890L;

        // Using printf with different placeholders
        System.out.printf("Integer: %d\n", integer);                // %d for int
        System.out.printf("Float: %.2f\n", floatingPoint);          // %.2f for float (2 decimal places)
        System.out.printf("Double: %.5f\n", doubleValue);           // %.5f for double (5 decimal places)
        System.out.printf("Character: %c\n", character);            // %c for char
        System.out.printf("String: %s\n", string);                  // %s for string
        System.out.printf("Long: %d\n", largeNumber);               // %d for long (same as int in printf)
    }
}
