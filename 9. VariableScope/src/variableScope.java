public class variableScope {
    static int x = 20;
    private int y;
    public void method(int a){
        System.out.println("variableScope.x: "+variableScope.x);
        this.x = 10;
        System.out.println("x after assigning value 10 : "+x);
        System.out.println("variableScope.x: "+variableScope.x);
        this.x=a;
        System.out.println("x after assigning value of a: "+x);
        y = a;
        System.out.println("y: "+y);
    }
    public static void main(String agrs[]){
        variableScope obj = new variableScope();
        obj.method(5);
        A objA=new A();
        System.out.println(objA.displayNum());
    }
}
