package Collection;

import java.util.Arrays;
import java.util.LinkedList;

public class ConvertLinkedListToArrayAndArrayToLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] stuff = {"babies","watermelon","melons","fudge"};
		 
		 //print Array before converting to list
		 System.out.println("Array before converting to list: ");
		 for(String a : stuff)
			 System.out.printf("%s ", a);
		 System.out.println();
		 
		 //convert array to list
		 
		 LinkedList<String> list1 = new LinkedList<String>(Arrays.asList(stuff));
		 
		 list1.add("marble");
		 list1.addFirst("mat");
		 
		 //print the list
		 System.out.println("print the list: ");
		 for(int i =0;i<list1.size();i++) {
			 System.out.printf("%s ",list1.get(i));
		 }
		 
		 System.out.println();
		 
		 //convert list to array
		 
		 stuff = list1.toArray(new String [list1.size()]);
		 System.out.println("print the array after converted from list: ");
		 for(String b : stuff)
			 System.out.printf("%s ", b);
		 
	}

}
