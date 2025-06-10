public class IfElseSample2 {
    public static void main(String[] args)
    {
      int a = 10;
      int b = 20;
      int c = 7;

      if(a > b && a > c){
        System.out.println("Variable a is greater than b and c");
      }
      else if(b > a && b > c){
        System.out.println("Variable b is greater than a and c");
      }
      else if(a > b && a < c){
        System.out.println("Variable a is greater than b but smaller than c");
      }
      else if(b > a && b < c){
        System.out.println("Variable b is greater than a but smaller than c");
      }
      else{
        System.out.println("Variable a, b and c are equal");
      }
    }
}
