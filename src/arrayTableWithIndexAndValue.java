
public class arrayTableWithIndexAndValue {

	int samplAarray[] = { 11, 22, 33, 44, 55 };
	int counter;

	public void arrayTableWithIndexAndValueWithForLoop() {
		System.out.println("Index \t Values");
		for (counter = 0; counter < samplAarray.length; counter++) {
			System.out.println(counter + "\t" + samplAarray[counter]);

		}
		System.out.println();
	}

	public void arrayTableWithIndexAndValueWithDoWhileLoop() {
		System.out.println("Index \t Values");
		counter = 0;
		do {
			System.out.println(counter + "\t" + samplAarray[counter]);
			counter++;
		} while (counter < samplAarray.length);

	}

	public void sumofArrayElementsWithDoWhile() {
		counter = 0;
		int sum = 0;
		do {
			sum += samplAarray[counter];
			counter++;

		} while (counter < samplAarray.length);
		System.out.println();
		System.out.println("Sum of array values: " + sum);
	}

	public void sumofArrayElementsWithForLoop() {
		int sum = 0;
		for (int x : samplAarray) {
			sum += x;
		}
		System.out.println();
		System.out.println("Sum of array values: " + sum);
	}

	public static void main(String[] args) {
		arrayTableWithIndexAndValue object = new arrayTableWithIndexAndValue();
		object.arrayTableWithIndexAndValueWithForLoop();
		object.arrayTableWithIndexAndValueWithDoWhileLoop();
		object.sumofArrayElementsWithDoWhile();
		object.sumofArrayElementsWithForLoop();
	}

}
