package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class addAllMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] stuff = {"apples","beef","corn","ham"};
		List<String> l1 = Arrays.asList(stuff);
		
		ArrayList<String> l2 = new ArrayList();
		l2.add("youtube");
    	l2.add("google");
    	l2.add("digg");

    	System.out.println("Print the first list for stuff array : \n");
    	
    	for(String x : l1)
    		System.out.printf("%s ",x);
    	System.out.println();
    	Collections.addAll(l2, stuff);
    	System.out.println();
    	System.out.println("Print the second list after all stuff array added in list2: \n");
    	for (String y  : l2)
    		System.out.printf("%s ", y);

		
	}

}
