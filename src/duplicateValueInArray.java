import java.util.*;

public class duplicateValueInArray {


    /*public static void usingForLoop(String[] a){


    }
*/
    public static void main(String[] args) {
        String[] names = {"java", "c", "python", "c#", "java","c"};
        String [] morename = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equals(names[j])) {
                    System.out.println("Duplicate Element Using For Loops : " + names[i]);
                }

            }
        }


        System.out.println("**************");

        Set<String> set1 = new HashSet<String>();

        for (String name : names) {
            if (set1.add(name) == false) {
                System.out.println("Duplicate Element Using Hash Set : " + name);
            }
        }

        System.out.println("**************");

       /* Map<String ,Integer> map1 = new HashMap<String ,Integer>();
        for(String name : names) {
         Integer count =    map1.get(name);
         if(count==null){
             map1.put(name,1);
         }
         else{
             map1.put(name,++count);
         }
        }
       Set<Map.Entry<String , Integer>> entrySet1 = map1.entrySet();
            for(Map.Entry<String,Integer> e1: entrySet1){
              if(e1.getValue()>1){
                  System.out.println("Duplicate Element Using Hash Map : " + e1.getKey());
              }
        }
*/
    }
}
