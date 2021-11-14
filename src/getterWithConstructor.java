import java.util.Scanner;

public class getterWithConstructor {
	
	String food;
		public getterWithConstructor(String favFood) {
			food=favFood;
		}
		
		public String getFavFood() {
			return food;
		}
		
		public void saying() {
			getFavFood();
		}
		

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter food name: ");
			String na = input.nextLine();
			getterWithConstructor object = new getterWithConstructor(na);
		
			
			object.saying();
			System.out.println("Name of fav food is: " + na);
		}


}
