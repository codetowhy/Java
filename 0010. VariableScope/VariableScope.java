public class VariableScope {
    static int x = 20;
    private int y;
    public void method(int a){
        System.out.println("variableScope.x: "+VariableScope.x);
        VariableScope.x = 10;
        System.out.println("x after assigning value 10 : "+x);
        System.out.println("variableScope.x: "+VariableScope.x);
        VariableScope.x=a;
        System.out.println("x after assigning value of a: "+x);
        y = a;
        System.out.println("y: "+y);
    }
    public static void main(String agrs[]){
        VariableScope obj = new VariableScope();
        obj.method(5);
        A objA=new A();
        System.out.println(objA.displayNum());
    }
}
