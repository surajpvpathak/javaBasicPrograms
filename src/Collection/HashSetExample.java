package Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample {
    //Hashset is a type of set , which will allow only single entry , will remove the duplicate entry if present
    public static void main (String[] main){

        //lets take one string array

        String[] name = {"suraj","pathak","sp","sp","suraj"};
        //convert array into list
        List<String> list1 = Arrays.asList(name);
        System.out.println("List is : ");
        //print the list , will print duplicate entry also
        for(String a : list1)
            System.out.printf("%s ", a);

        System.out.println();
        System.out.println("list size is : " + list1.size());

        //convert list into set
        Set<String> set1 = new HashSet<String>(list1);
        System.out.println("Set is : ");
        //print the set , will not print duplicate entry also
        for(String b : set1)
            System.out.printf("%s ", b);
        System.out.println();
        System.out.println("set size is : " + set1.size());
    }
}
