
public class Test05 {
	public static void main(String[] args) {
		int  leapYear = 4000;
		if(leapYear%4==0||leapYear%400==0&&!(leapYear%100==0)){
			System.out.println("ÈòÄê");
		}else{
			System.out.println("Æ½Äê");
		}
	}

}
