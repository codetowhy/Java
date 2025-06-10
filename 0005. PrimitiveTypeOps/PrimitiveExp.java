public class PrimitiveExp {
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

    }
}
