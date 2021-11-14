import java.util.Scanner;

public class calculatorUsingSwithCase {

	double fnum, snum, result;
	String choice;

	public void cal() {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter first number: ");
		fnum = in.nextDouble();
		System.out.println("Enter second number: ");
		snum = in.nextDouble();

		System.out.println("Enter the sign for required operation (+,-,*,/): ");
		choice = in.next();

		switch (choice) {

		case ("+"):
			result = fnum + snum;
			System.out.println("adition is : " + result);
			break;
		case ("-"):
			result = fnum - snum;
			System.out.println("sub is : " + result);
			break;
		case ("*"):
			result = fnum * snum;
			System.out.println("mul is : " + result);
		case ("/"):
			if (snum == 0) {
				System.out.println("can not divided by 0");
				System.out.println("Enter again Second Number : ");
				snum = in.nextDouble();
			}
			result = fnum / snum;
			System.out.println("div is : " + result);
			break;
		default:
			System.out.println("Enter Correct Choice");

		}
	}

	public static void main(String[] args) {
		calculatorUsingSwithCase calObject = new calculatorUsingSwithCase();
		calObject.cal();
	}
}
