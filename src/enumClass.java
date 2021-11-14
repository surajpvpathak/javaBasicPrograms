
public enum enumClass {

	bucky("first", "10"), lucy("second", "22"), rosy("third", "24"), kat("fourth", "13"), aish("fifth", "45"),
	kaly("sixth", "32"), gen("seventh", "26");

	private final String desc;
	private final String year;

	enumClass(String description, String yr) {

		desc = description;
		year = yr;
	}

	public String getdesc() {
		return desc;
	}

	public String getyear() {
		return year;
	}

}
