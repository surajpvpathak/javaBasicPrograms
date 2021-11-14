import java.util.EnumSet;

public class mainClassForEnumClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (enumClass ec : enumClass.values()) {
			
			System.out.printf("%s\t%s\t%s\n",ec , ec.getdesc(), ec.getyear());
			
			System.out.println();
			System.out.println("with enumSetRange");
			System.out.println();
				
				for(enumClass ec1 : EnumSet.range(ec.rosy , ec.kaly)) {
				
				System.out.printf("%s\t%s\t%s\n",ec1 , ec1.getdesc(), ec1.getyear());
				}
			
		}
			
		}
		

	}

