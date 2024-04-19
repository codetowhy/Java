public class Example {
    public static void main(String[] args) {

        System.out.println();
        //Primitive Data Types -
        int a = 10;
        int b = 20;
        //in below line value of variable b is copied to variable a
        a = b;
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        b = b + 1;
        //changes to variable b won't affect variable a

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        System.out.println();
        System.out.println();

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

        //changes to Array arr will affect Array brr
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
