public class findMissingNumberInArray {
    public static void main(String[] args){
        int a[] = {1,2,4,5}; // here 3 is missing

        // so first we will do sum of all array elements  store it in sum1
        //then sum of all elements starting from 1 to ending from last element of array
        //find the difference betwenn this two --> it will be our missing number


        int sum = 0;
        for(int i = 0;i<a.length;i++){
            sum = sum + a[i];
        }
        System.out.println(sum);
        int sum1 = 0;
        for(int j = 1;j<=a[a.length-1];j++){
            sum1 = sum1 + j;
        }
        System.out.println(sum1);
        System.out.println("Missing number is : "+(sum1-sum));
    }
}
