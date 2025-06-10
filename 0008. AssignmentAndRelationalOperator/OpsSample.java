public class OpsSample {
    public static void main(String[] args) {
        //Assignment Operators :

        //(=) Operator
        int integerVariable = 10;
        String text = "HelloFromString";
        int[] integerArray = {1, 3, 2, 1, 4, 5, 8};
        char[] characterArray = {'a', 'b', 'c', 'd', 'e'};
        float floatVariable = 11.5f;

        System.out.println("Integer :" + integerVariable);
        System.out.println("String :" + text);
        System.out.println("Float :" + floatVariable);

        System.out.println("Integer Array :");
        for (int i : integerArray)
            System.out.print(i + " ");

        System.out.println();
        System.out.println("Character Array :");
        for (char ch : characterArray)
            System.out.print(ch + " ");

        System.out.println();
        //(+=), (-=), (*=), (/=), (%=) Operator
        int a = 10;
        int b = 15;
        System.out.println("b+=a => (b = b + a) : " + (b += a));
        System.out.println("a-=b => (a = a - b) : " + (a -= b));
        System.out.println("a*=b => (a = a * b) : " + (a *= b));
        System.out.println("b/=5 => (b = b / 5) : " + (b /= 5));
        System.out.println("a%=2 => (a = a % 2) : " + (a %= 2));
        System.out.println();

        //Relational Operators :

        //(==) Equal to, (>) Greater than, (<) Smaller than
        //(>=) Greater than or equal to, (<=) Smaller than or equal to
        System.out.print("a : " + a);System.out.println(", b : " + b);
        System.out.println("Is b equal to a : " + (b == a));
        System.out.println("Is a greater than or equal to b : " + (a >= b));
        System.out.println("Is a less than or equal to b : " + (a <= b));
        System.out.println("Is b greater than 5 : " + (b > 5));
        System.out.println("Is a less than 2 : " + (a < 2));
    }
}
