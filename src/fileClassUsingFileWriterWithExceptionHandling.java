import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Formatter;
import java.util.Scanner;

public class fileClassUsingFileWriterWithExceptionHandling {
	

	
	
	
	public File file = new File("C:\\Users\\surapath\\Desktop\\FileClassJava.txt");
	
	Formatter format;
	
	/*public  void formatter(File f) {
		file = f;
	}*/
	 
	public void createAndWriteFile() {
		
		
		try{
				FileWriter fe = new FileWriter(file);
		fe.write("surajpathak");
		fe.write(" spathak");
		fe.write(" sp1");
		fe.close();
			
			/*format.format("%s%s%s\n", "suraj","pathak","24",file);
			format.format("%s%s%s\n", "sa","pathak","24");
			format.format("%s%s%s\n", "s","pathak","24");
			format.close();*/
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
public void openFile() {
	try {
		Scanner sc = new Scanner(file);
		while(sc.hasNext()) {
			String a = sc.next();
			String b = sc.next();
			String c = sc.next();
			System.out.printf("%s %s %s\n", a,b,c);
		}
	
	}catch(Exception e){
		System.out.println(e);
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fileClassUsingFileWriterWithExceptionHandling fc = new fileClassUsingFileWriterWithExceptionHandling();
	
		fc.createAndWriteFile();
		fc.openFile();
	}

}
