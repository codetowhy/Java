public class CustomNonZeroMaxIntWrapper {
    int[] intArray;

    CustomNonZeroMaxIntWrapper(int _size) {
        intArray = new int[_size];
    }

    protected int length() {
        return this.intArray.length;
    }

    protected void insert(int str) {
        for (int index = 0; index < this.intArray.length; ++index) {
            if (intArray[index] == 0) {
                intArray[index] = str;
                break;
            }
        }
    }

    protected void display() {
        int i=0;
        for (int num : this.intArray) {
            if (num != 0)
                System.out.println("Item at index["+i+"] : "+num);
            i++;
        }
    }

    protected int maximum() {
        int max = 0;
        for (int num : this.intArray) {
            if (num > max)
                max = num;
        }
        return max;
    }
}
