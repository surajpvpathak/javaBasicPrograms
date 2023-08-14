import java.util.*;

public class intArray {

//string = "suraj pathak";

    public static void main(String[] args) {
        String sp = "This is sample program";

        PranavMethodToFindHighestNumberInString();
    }
       /* int count = 0;
        char[] ch = sp.toCharArray();*/

     //   *********** print highest character with its number *****************

     /*  public static void maximumCharOccurence(String maxOccStr) {
        maxOccStr=   maxOccStr.replaceAll(" ", "");
            int i, max = 0;
            int[] charFreq = new int[256];
            for(i = 0; i < sp.length(); i++)
            {
                charFreq[sp.charAt(i)]++;
            }
            for(i = 0; i < 256; i++)
            {
                if(charFreq[i] > charFreq[max]) {
                    max = i;
                }
            }
            System.out.format("\nThe Maximum Occurring Character = %c",  max);
            System.out.format("\n'%c' Character Occurs %d Times ", max, charFreq[max]);
      }*/


            //   *********** print highest character with its number *****************


/*       **** using simple for loop to print all characters no of times **********
        List<Character> list1 = new ArrayList<>();

        for (char c : ch) {


            System.out.println("The Character " + c + " coming : " + Collections.frequency(list1, c) + " times in string: " + sp);

        }

         **** using simple for loop to print all characters no of times ***********/

    /*   ************** Using List  ****************
        List<Character> list3 = new ArrayList<>();
        ArrayList <Integer> list2 = new ArrayList<Integer>();
        for(char a : ch){
            list3.add(a);
        }
        for(char c : list3){
            count =  Collections.frequency(list1,c);
         //   System.out.println(count);
            list2.add(count);


        }

        Integer[] intArray = list2.toArray(new Integer[list2.size()]);
        Arrays.sort(intArray);
        System.out.println(intArray[intArray.length-1]);

          ************** End Using List  *****************/


/*        *************** Using Map ****************
 HashMap<Character,Integer> map1 = new HashMap<Character,Integer>();
for(char c : list1){
               count =  Collections.frequency(list1,c);
         map1.put(c,count);
        }
    Map.Entry<Character,Integer> maxEntry = null;
    for(Map.Entry<Character,Integer> entry1 : map1.entrySet()){
        if(maxEntry == null || entry1.getValue().compareTo(maxEntry.getValue())>0){
            maxEntry = entry1;

        }

    }
    System.out.println(maxEntry.getKey());
       System.out.println(maxEntry.getValue());  // --> Gives only number not the character value
     *************** End Using Map *****************/


/********************** Pranav ***************************************************/

   //     public class HighestOccurringCharacter {
            public static void PranavMethodToFindHighestNumberInString() {
                String input = "This is sample program. 555555";
                int highest = 0;
                char highestChar = input.toCharArray()[0];
                for (char c : input.toCharArray()) {
                    int count = 0;
                    for (char cin : input.toCharArray()) {
                        if (c==cin) count++;
                    }
                    if (count > highest) {
                        highest = count;
                        highestChar = c;
                    }
                }
                System.out.println("Highest occurring " + highest + " times character [ " + highestChar + " ] in " + input);
            }
        }



    //}
//}









