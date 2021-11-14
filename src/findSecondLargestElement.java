import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class findSecondLargestElement {


        public static int getSecondLargestUsingSimpleFor(int[] a, int total){
            int temp;
            for (int i = 0; i < total; i++)
            {
                for (int j = i + 1; j < total; j++)
                {
                    if (a[i] > a[j])
                    {
                        temp = a[i]; // here assigning temp value to index i , lets check at index 0 , i=0 , for array 6,5,4,3 ; temp=a[0]=6
                        a[i] = a[j]; //here actual exchange of index is done , basically the index i value is updated with the index j value ; a[0]=a[1] which is 5
                        a[j] = temp; // here at a[j] , the temp value is given and a[j] value updated with temp ; a[1] = temp which is 6 , so at the end of this line , we have array as 5,6,4,3
                        //similarly small values will be shift to start of the array and array will be sorted
                    }
                    for(Integer z : a)
                        System.out.printf("%s \n",z);
                    System.out.println("clear");
                }
            }
            return a[total-2];
        }

        public static int getSecondLargestElementUsingArrays(int[] a){
            Arrays.sort(a);
            return a[a.length-2]; // here as array is sort , then the array from 6,5,4,3 becomes 3,4,5,6 , and we need second large number , so array length = 4 and
            //at 4th location we have 3rd index a[3] which is 6 , so we need value of the second last index so we did lenght-2
        }

    public static int getSecondLargestElementUsingCollectionList(Integer[] a){
        List<Integer> list1 =Arrays.asList(a);
        Collections.sort(list1);
        int element=list1.get(list1.size()-2);
        return  element;
    }

        public static void main(String args[]){
            int a[]={6,5,4,3,2,1};
          int b[]={44,66,99,77,33,22,55};
            Integer c[]={44,66,99,77,33,22,55};
            System.out.println("Second Largest: "+getSecondLargestUsingSimpleFor(a,a.length));
          System.out.println("Second Largest: "+getSecondLargestElementUsingArrays(b));
            System.out.println("Second Largest: "+getSecondLargestElementUsingCollectionList(c));
        }
    }

