import java.util.ArrayList;

public class ArrayListSample {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

        //Fetching the size/length of Array List
        System.out.printf("Array List Size: %d%n", al.size());

        //Remove element from Array List a index 2
        al.remove(2);

        //Checking if Array List has value
        System.out.printf("Is Array List Empty ? %b%n",al.isEmpty());

        System.out.println("Displaying Array :");
        for(int i : al){
            System.out.print(i+" ");
        }

        //Checking if element exist in Array List has value
        System.out.printf("%nCheck if element exist in Array List : %b", al.contains(5));
    }
}
