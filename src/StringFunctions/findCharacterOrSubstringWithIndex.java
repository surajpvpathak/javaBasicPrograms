package StringFunctions;

public class findCharacterOrSubstringWithIndex {
	public static void main(String[] args) {
		charOrSubString();
		concatFunction();
		replaceFunction();
		toUpperAndLowerCase();
		trimFunction();

	}
	
	public static void charOrSubString() {
		String a = "buckyrobertsbuckyroberts";
		System.out.println("k word index");
		System.out.println(a.indexOf("k"));
		System.out.println("k word index with int arg");
		System.out.println(a.indexOf("k",5));
		System.out.println("invalid word x index search");
		System.out.println(a.indexOf("x"));
		System.out.println("substring index");
		System.out.println(a.indexOf("rob"));
		System.out.println("substring index with int arg");
		System.out.println(a.indexOf("rob",10));
	}
	
	public static void concatFunction() {
		String a = "suraj";
		String b = " Pathak";
		System.out.println();
		System.out.println("concat function");
		System.out.println(a.concat(b));
	}
	
	public static void replaceFunction() {
		String a = "suraj";
		String b = " Pathak";
		System.out.println();
		System.out.println("replace function");
		System.out.println(a.replace("a", "b"));
		System.out.println(a.replace("aj", "bk"));
	}
	
	public static void toUpperAndLowerCase() {
		String a = "suraj";
		String b = " PATHAK";
		System.out.println();
		System.out.println("uppercase function");
		System.out.println(a.toUpperCase());
		System.out.println("lower function");
		System.out.println(b.toLowerCase());
	}
	
	public static void trimFunction() {
		String a = "suraj    ";
		String b = "    PATHAK";
		System.out.println();
		System.out.println("trim function");
		System.out.println(a.trim());
		System.out.println(b.trim());
	}

}
