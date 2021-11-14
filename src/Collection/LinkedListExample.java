package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListExample {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] things = {"apples","noobs","pwnge","bacon","goATS"};
		
		List<String> list1 = new LinkedList<String>();
	
		//add array to list
		
		for(String x : things)
			list1.add(x);
		
		String[] things2 = {"sausage","bacon","goats","harrypotter"};
		List<String> list2 = new LinkedList<String>();
		
		for(String y : things2)
			list2.add(y);
		
		list1.addAll(list2);
		list2 = null;
		System.out.print("Addition of two list: ");
		
		printMe(list1);
		removeStuff(list1,1,5);
		printMe(list1);
		reverseMe(list1);
		
	}
	
	private static void printMe(List<String> l) {
		for(String a : l)
		//	l.add(a);
		System.out.printf("%s ", a);
		System.out.println();
		System.out.println();

	}
	
	private static void removeStuff(List<String> l , int from, int to) {
		System.out.print("The list after elements from index 2 to 5 removed : ");
		l.subList(from, to).clear();
		System.out.println();
	}
	
    private static void reverseMe(List<String> l) {
        ListIterator<String> reverse =  l.listIterator(l.size());
        System.out.print("The reversed list: ");
	    while (reverse.hasPrevious()) {
	    	System.out.printf("%s ",reverse.previous());
	    }
} 

	
	

}
