public class example {
    public static void main(String[] args) {
        //Bitwise Complement Operator
        //It is basically 2's complement for an integer
        int e = 2;
        e = ~e;
        //Bitwise Complement is basically 2's complement for an integer
        //Formula for positive operand : ~(operand) = -(operand+1)
        //binary of 2 is 10. So, -(10+1) will be bitwise complement of 2 i.e. -(11) in binary
        //on converting -(11) to decimal it will be -(3)
        System.out.println("Bitwise Complement Operator ~(operand), e : "+e);

        int d = -10;
        d = ~d;
        //Formula for negative operand : ~(operand) = (operand-1)
        //binary of -10 is -(1010). So, (1010-1) will be bitwise complement of 2 i.e. (1001) in binary
        //on converting (1001) to decimal it will be 9
        System.out.println("Bitwise Complement Operator ~(operand), e : "+d);
    }
}
