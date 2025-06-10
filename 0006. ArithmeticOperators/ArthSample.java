public class ArthSample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result;

        //Addition
        result = b + a;
        System.out.println("b + a = " + result);

        //Subtraction
        result = b - a;
        System.out.println("b - a = " + result);

        //Multiplication
        result = b * a;
        System.out.println("b * a = " + result);

        //Division
        result = b / a;
        System.out.println("b / a = " + result);

        //Modulo
        result = a % b;
        System.out.println("a % b = " + result);

        //Arithmetic Short-hand
        a+=b; // a = a + b
        System.out.println("a+=b : " + a);

        b-=a; // b = b - a
        System.out.println("b-=a : " + b);
    }
}
