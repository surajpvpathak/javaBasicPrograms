package Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reverseCopyAndFillMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character[] ray = {'p','w','n'};
		
		//convert to list
		
		List<Character> l1 = Arrays.asList(ray);
		System.out.println("List is : ");
    	output(l1);

    	
    	//reverse list and print out it
    	Collections.reverse(l1);
    	System.out.println("List after reversed : ");
    	output(l1);
    	
    	//fill the list with one more element
    	Collections.fill(l1, 'X');
    	System.out.println("List after fill method : ");
    	output(l1);
    	
    	//copy content of l1 list to listcopy list
    	//to copy create new array and new list of the same size of old one 
    	
    	Character[] ray2 = new Character[ray.length];
    	List<Character> l2 = Arrays.asList(ray2);
    	
    	Collections.copy(l2, l1);
    	System.out.println("New copiedlist is  : ");
    	output(l1);
    	
    	//convert this new list to array again
    	l2.toArray(new Character[l2.size()]);
    	System.out.println("New copiedlist converted to array  : ");
    	for(Character x : ray2)
    		System.out.printf("%s ", x);
		
	}
	
	private static void output(List<Character> list) {
		for(Character b : list)
			System.out.printf("%s ",b);
		System.out.println();
	}

}
