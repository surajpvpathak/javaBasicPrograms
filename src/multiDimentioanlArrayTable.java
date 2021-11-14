
public class multiDimentioanlArrayTable {

	public static void main(String[] args) {

		int firstArray[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
		int secondArray[][] = { { 1, 2, 3, 4 }, { 45 }, { 22, 33, 45 }, { 22, 34 } };
		// TODO Auto-generated method stub'
		System.out.println("First Array Table : ");
		display(firstArray);
		System.out.println();
		System.out.println("Second Array Table : ");
		display(secondArray);
	}

	public static void display(int x[][]) {

		for (int row = 0; row < x.length; row++) {
			for (int col = 0; col < x[row].length; col++) {
				System.out.print(x[row][col] + "\t");
				
			}System.out.println();

		}
	}
}
