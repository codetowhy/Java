public class IfElseSample3 {
    public static void main(String[] args)
    {
      boolean a = true;
      boolean b = false;
      boolean c = true;

      if(a && b){
        System.out.println("a && b");
        // this will not be executed because condition says both a and b must be true
      }
      if(b || a){
        System.out.println("b || a");
        // this will be executed because condition says either b or a must be true
      }
      if(a && c){
         System.out.println("a && c");
        // this will be executed because condition says both a and c must be true
      }
      if(a && c || b){
        System.out.println("a && c || b");
       // this will be executed because condition says either a and b must be true or b must be true
      }
      if(a && (c || b)){
        System.out.println("a && (c || b)");
       // this will be executed because condition says either a and b must be true or b must be true
      }
      if(a && c && b){
        System.out.println("a && c && b");
       // this will not be executed because condition says a, b and c must be true
      }
    }
}
