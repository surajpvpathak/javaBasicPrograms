import java.util.Arrays;

public class smallestAndLargestInArray {


    public static void main(String[] args) {
        int[] arr = {8, 2, 3, 12, 5};
        System.out.println("Largest Number: " +returnLargestNumber(arr));
        System.out.println("Smallest Number: " + returnSmallestNumber(arr));

        System.out.println("Largest Number_Arrys: " +getLargest(arr));
        System.out.println("Smallest Number_Arrays: " + getSmallest(arr));

    }

    public static int returnLargestNumber(int arr[]) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        } return arr[arr.length-1];
    }

    public static int returnSmallestNumber(int arr[]) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        } return arr[0];
    }

    //Array Method

    public static int getLargest(int [] a){
        Arrays.sort(a);
        return a[a.length-1];
    }
    public static int getSmallest(int [] a){
        Arrays.sort(a);
        return a[0];
    }


}
