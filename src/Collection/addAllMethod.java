package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class addAllMethod {

	public static void main(String[] args) {
		System.out.println("Using different approach : \n");
		addArray();


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

	public static void addArray(){
		String [] stuff = {"apples","beef","corn","ham"};
		String[] moreStuff = {"youtube","google","digg"};

		/*for(int i=0;i<stuff.length-1;i++){

		}*/
			int count = 0;
			String [] addition = new String[stuff.length + moreStuff.length];
		for(String x : moreStuff ){
			addition[count] = x;
			count++;
		}
		for(String x : stuff ){
			addition[count] = x;
			count++;
		}
		System.out.println(Arrays.toString(addition));
	}

}
