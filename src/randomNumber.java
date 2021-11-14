import java.util.Random;

public class randomNumber {
	
	
	public void generateRandomNumberFrom0 () {
		
		//ithe aplyala 10 random numbers pahije ani it should be only between 0-8
		
		int counter,num;
		
		Random rn = new Random();
		
		for(counter = 1 ; counter<= 10;counter ++) {
			num = rn.nextInt(9);
			System.out.println(num);
			
		}System.out.println();
	}
	
public void generateRandomNumberFrom1 () {
		
		//ithe aplyala 10 random numbers pahije ani it should be only between 1-8
		
		int counter,num;
		
		Random rn = new Random();
		
		for(counter = 1 ; counter<= 10;counter ++) {
			//num = rn.nextInt(9);
			num = 1+rn.nextInt(9);
			System.out.println(num);
		}
	}
	
	
	public static void main(String[] args) {
		randomNumber object = new randomNumber();
		object.generateRandomNumberFrom0();
		object.generateRandomNumberFrom1();
	}

}
