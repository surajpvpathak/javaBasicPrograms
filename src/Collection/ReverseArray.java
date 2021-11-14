package Collection;

public class ReverseArray {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] things = {"apples","noobs","pwnge","bacon","goATS"};
		reverseArrayByForLoop(things);
		reverseArrayWithAnotherArrayMethod(things,things.length);
	}

	private static void reverseArrayByForLoop(String[] a) {
		
		System.out.println("Normal Array : ");
		System.out.println();
		for(String x : a) {
			
			System.out.println(x);
		}
		System.out.println();
		
		System.out.println("Reversed Array using for loop : ");
		System.out.println();
		String x;
		for(int i = a.length ; i>0;i--) {
			x=a[i-1];
			System.out.println(x);
		}
	}
	
	private static void reverseArrayWithAnotherArrayMethod(String [] b , int n) {
		String [] c = new String[n];
		int j = n;
		for(int i = 0 ; i<n ; i++) {
			c[j-1] = b[i];
			j=j-1;
		}
		System.out.println();
		System.out.println("Reversed Array using another array : ");
		System.out.println();
		for(int k = 0;k<n;k++)
		{
			System.out.println(c[k]);
		}
	}
}
