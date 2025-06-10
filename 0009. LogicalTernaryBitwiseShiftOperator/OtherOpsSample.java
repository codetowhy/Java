public class OtherOpsSample {
    public static void main(String[] args){
        boolean val1 = true, val2 = false, val3 = true;
        //LOGICAL OPERATORS
        System.out.println("AND Operator, val1 && val2: "+(val1 && val2));
        System.out.println("AND Operator, val1 && val3: "+(val1 && val3));
        System.out.println(("OR Operator, val1 || val2: "+(val1 || val2)));
        System.out.println(("NOT Operator, !val2: "+(!val2)));

        //TERNARY OPERATOR
        int num1=2, num2=3, num3 =4;
        System.out.println("Find the greatest number using Ternary Operator: "+
                (num1>num2?(num1>num3?num1:num3):num2>num3?num2:num3));

        //BITWISE OPERATORS
        System.out.println("num1 ^ num2: " + (num1 ^ num2));
        System.out.println("~num1: " + (~num1));

        //SHIFT OPERATORS
        System.out.println("num1 << 2: " + (num1 << 2));
        System.out.println("num2 >> 1: " + (num2 >> 1));
        System.out.println("num3 >>> 1: " + (num3 >>> 1));

        //INSTANCEOF OPERATORS
        Person obj1 = new Person();
        Person obj2 = new Boy();

        // As obj is of type person, it is not an
        // instance of Boy or interface
        System.out.println("obj1 instanceof Person: "
                + (obj1 instanceof Person));
        System.out.println("obj1 instanceof Boy: "
                + (obj1 instanceof Boy));
        System.out.println("obj1 instanceof MyInterface: "
                + (obj1 instanceof MyInterface));

        // Since obj2 is of type boy,
        // whose parent class is person
        // and it implements the interface Myinterface
        // it is instance of all of these classes
        System.out.println("obj2 instanceof Person: "
                + (obj2 instanceof Person));
        System.out.println("obj2 instanceof Boy: "
                + (obj2 instanceof Boy));
        System.out.println("obj2 instanceof MyInterface: "
                + (obj2 instanceof MyInterface));
    }
}

class Person {
}

class Boy extends Person implements MyInterface {
}

interface MyInterface {
}
