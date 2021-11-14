import java.util.Scanner;

public class averageOfNumbers {
	
	int grade;
	int total = 0;
	int counter = 0;
	double average;
	
	public void avg() {
		Scanner input = new Scanner(System.in);
		grade = input.nextInt();
	do {
		total = total+grade;
		
		
		System.out.println("num is " +grade);
		System.out.println("sum is " +total);
		grade++;
		counter++;
	}while (grade <= 10);
	
	average = total/counter;
	System.out.println("average is " +average);
	}
	
	public int averageProgramUsingVariableLengthArguments(int... x) {
		int total=0;
		for(int sum : x) {
			total+=sum;
			
		}
		return total/x.length;
	
	
	}
	
	public static void main(String[] args) {
	
		averageOfNumbers object = new averageOfNumbers();
		object.avg();
		
		System.out.println();
		System.out.println("Average using Variable Length Arguments: ");
		System.out.println(object.averageProgramUsingVariableLengthArguments(22,33,44,55));
		
	}
}
