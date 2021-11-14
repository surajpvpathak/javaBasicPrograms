package Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class collectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] crap = {"apples","lemons","geese","bacon","youtube"};
		
		//sort alphabetically 

		List<String> list = Arrays.asList(crap);
		
		Collections.sort(list);
		
		System.out.printf("%s%s\n","The sorted list is: ",list);
		
		//descending oorder sort
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.printf("%s%s\n","The sorted list descending order is: ",list);
		
	}

}
