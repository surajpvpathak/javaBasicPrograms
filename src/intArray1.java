import java.util.Arrays;
import java.util.HashSet;

public class intArray1 {

    public static void main(String[] args) {

        Integer[] arr = {10, 10, 50, 20, 45, 60, 25, 25, 90};

        HashSet<Integer> set1 = new HashSet<>();
        for (int a : arr) {
            set1.add(a);
        }
        arr = new Integer[set1.size()];
        set1.toArray(arr);
      Arrays.sort(arr);
    //    System.out.println(arr);
       /* for(int i = 0; i< arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }*/

        for(int x : arr){
            System.out.print(x + "\t");
        }

    }
    }

//  Input: {This is sample program} Output: s is repeated 3 times

