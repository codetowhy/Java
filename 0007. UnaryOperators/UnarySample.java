public class UnarySample {
    public static void main(String[] args) {
        //Unary Minus Operator
        int i = 20;
        i = -i;
        System.out.println("Unary Operator -(operand) :" + i);
        System.out.println();

        //Not Operator
        boolean boolVariable = true;
        boolVariable = !boolVariable;
        System.out.println("Not Operator !(operand) :" + boolVariable);
        System.out.println();

        //Increment Operator
        int b = 20;
        //Prefix
        ++b;
        System.out.println("Prefix Increment ++(operand), b :" + b);
        //Postfix
        b++;
        System.out.println("Postfix Increment (operand)++, b :" + b);

        //Prefix & Postfix together
        int a = 10;
        int output = ++a + a++ + ++a + ++a + a;
        //output = (11) + (11) + (13) + (14) + (14)
        //output = (prefix a) + (postfix a) + (prefix a) + (prefix a) + a
        System.out.println("Final value of a: " + a);
        System.out.println("output : " + output);
        System.out.println();

        //Decrement Operator
        int c = 20;
        //Prefix
        --c;
        System.out.println("Prefix Decrement --(operand), c :" + c);
        //Postfix
        c--;
        System.out.println("Postfix Decrement (operand)--, c :" + c);

        //Prefix & Postfix together
        int d = 10;
        int result = --d + d-- + --d + --d + d--;
        //result = (9) + (9) + (7) + (6) + (6)
        //result = (prefix d) + (postfix d) + (prefix d) + (prefix d) + (postfix d)
        System.out.println("Final value of d: " + d);
        System.out.println("result : " + result);
        System.out.println();

        //Bitwise Complement Operator
        //It is basically 2's complement for an integer
        int e = 2;
        e = ~e;
        //Bitwise Complement is basically 2's complement for an integer
        //Formula for positive operand : ~(operand) = -(operand+1)
        //binary of 2 is 10. So, -(10+1) will be bitwise complement of 2 i.e. -(11) in binary
        //on converting -(11) to decimal it will be -(3)
        System.out.println("Bitwise Complement Operator ~(operand), e : "+e);

        int f = -10;
        f = ~f;
        //Formula for negative operand : ~(operand) = (operand-1)
        //binary of -10 is -(1010). So, (1010-1) will be bitwise complement of 2 i.e. (1001) in binary
        //on converting (1001) to decimal it will be 9
        System.out.println("Bitwise Complement Operator ~(operand), f : "+f);
    }
}
