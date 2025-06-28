import java.util.Vector;

public class VectorSample {
  public static void main(String[] args) {
    Vector<Integer> v = new Vector<Integer>();
    v.add(1);
    v.add(21);
    v.add(14);
    v.add(56);

    for(int i : v){
        System.out.println(i);
    }
  }  
}
