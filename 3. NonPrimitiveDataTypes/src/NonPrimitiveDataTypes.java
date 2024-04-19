public class NonPrimitiveDataTypes {
    public static void main(String[] args){
        String msg="Hello World";
        String msgUsingNew = new String("Hello World From new keyword");
        ClassA obj = new ClassA();

        System.out.println(msg);
        System.out.println(msgUsingNew);
        obj.Display();
    }
}
