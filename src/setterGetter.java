import java.util.Scanner;

public class setterGetter {
	
	public String gf;
	public String food;
	
	public void setName(String name) {
		gf=name;
	}
	
	public String getName() {
		return gf;
	}
	
	public void saying() {
		getName();
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name: ");
		String na = input.nextLine();
		setterGetter object = new setterGetter();
	
		object.setName(na);
		object.saying();
		System.out.println("Name of gf is: " + na);
	}

}
