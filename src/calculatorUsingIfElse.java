import java.util.Scanner;

public class calculatorUsingIfElse {

	Scanner in = new Scanner(System.in);
	double fnum, snum, result;
	String choice;

	public void cal() {
		System.out.println("Enter First Number : ");
		fnum = in.nextDouble();
		System.out.println("Enter Second Number : ");
		snum = in.nextDouble();
		System.out.println("Enter the sign for required operation (+,-,*,/): ");
		choice = in.next();

		if (choice.equals("+")) {
			result = fnum + snum;
			System.out.println("adition is : " + result);
		}

		else if (choice.equals("-")) {
			result = fnum - snum;
			System.out.println("sub is : " + result);
		}

		else if (choice.equals("*")) {
			result = fnum * snum;
			System.out.println("mul is : " + result);
		}

		else if (choice.equals("/")) {
			if (snum == 0) {
				System.out.println("can not divided by 0");
				System.out.println("Enter again Second Number : ");
				snum = in.nextDouble();
			}
			result = fnum / snum;
			System.out.println("div is : " + result);
		} else {
			System.out.println("Enter Correct Choice");
		}
	}

	// call this calulator class object in main class like this :

	public static void main(String[] args) {
		calculatorUsingIfElse calObject = new calculatorUsingIfElse();
		calObject.cal();
	}

}
