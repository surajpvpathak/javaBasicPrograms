import java.util.Scanner;

public class recursion_FactorialProgram {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter number: ");
		
		System.out.println(recurssion(scan.nextInt()));
	}
	
	
	public static int recurssion(int n){
		
		//Recursion : method calls itself upto base condition	
		
		if(n<=1) {
			return 1;
		}
		else {
			return n * recurssion(n-1);
		}
	}

	}

