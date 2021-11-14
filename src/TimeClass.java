
public class TimeClass {

	private int hour,minute,seconds;
	
	public void setTime(int h, int m , int s) {
		hour = (h>=0 && h <=60) ? h : 0;
		minute = (m>=0 && m<=60) ? m : 0;
		seconds = (s>=0 && s<=60) ? s :0;
		
	}
	
	public String getTimeInStringMilitaryFormat() {
	return String.format("%02d:%02d:%02d",hour,minute,seconds);
		
	}
	
	public String getTimeInStringRegularFormat() {
		String a =  String.format("%d:%02d:%02d" , ((hour == 0 || hour == 12) ? 12 : hour%12),minute,seconds);
		String b = hour<12?" AM":" PM";
				return a+b;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeClass tc = new TimeClass();
		tc.setTime(2, 25, 46);
		System.out.println("Miltiary Time (24 hr format) set by user : " + tc.getTimeInStringMilitaryFormat());
		System.out.println("Regular Time (12 hr format) set by user : " + tc.getTimeInStringRegularFormat());
	}
	
	

}
