package StringFunctions;

public class otherStringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] sa = {"funk","chunk","furry","baconator"}; 
		
		//startswith fu
		
		for(String x : sa) {
			if(x.startsWith("fu")) {
			System.out.println(x + " starts with fu word");
			}
			if(x.endsWith("nk")) {
			//ends with nk
			System.out.println(x + " starts with nk word");
			}
		}
	}
	
	
}
