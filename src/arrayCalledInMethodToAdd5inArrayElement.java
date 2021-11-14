
public class arrayCalledInMethodToAdd5inArrayElement {
	
	public static void main(String[] args){
		
		int bucky[] = {15,25,35,45,55};
		
		change(bucky);
		
		for(int y : bucky) {
		
		System.out.println(y);
		}
	}
	
	public static void change(int x[]) {
		
		for(int i = 0;i<x.length;i++) {
			x[i]+=5;
		}
	}

}
