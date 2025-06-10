public class wrapperSample {
    public static void main(String[] args) {
        int num = 20456;
        char ch = 'A';
        //Wrapper class is a class whose object wraps/contains primitive data types.

        //Below are some pre-defined wrapper classes in Java
        Integer objNumInt = num;
        Float objNumFloat = (float) num;
        Double objNumDouble = (double) num;
        Character objCh = ch;

        System.out.println("Integer Class: " + objNumInt);
        System.out.println("Float Class: " + objNumFloat);
        System.out.println("Double Class: " + objNumDouble);
        System.out.println("Character Class: " + objCh);

        //Custom Wrapper Class built on top of primitive data type "int"
        CustomNonZeroMaxIntWrapper obj = new CustomNonZeroMaxIntWrapper(4);
        obj.insert(20);
        obj.insert(10);
        obj.insert(2);
        obj.insert(24);
        System.out.println("obj Length: "+obj.length());
        System.out.println("obj items are -");
        obj.display();
        System.out.println("obj maximum item: "+obj.maximum());

    }
}

