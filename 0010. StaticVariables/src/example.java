public class example {
    static String msg = "Hello from Static String";
    static int num = 10;

    public static void main(String[] args) {
        System.out.println(msg);
        example obj = new example();
        obj.display();
    }

    public void display() {
        num = 20;
        //below commented line of code has error because
        //static member can't be declared within instance methods.
        //static int num2 = 30;
        System.out.println("Overridden value of Static Integer: " + num);
    }
}
