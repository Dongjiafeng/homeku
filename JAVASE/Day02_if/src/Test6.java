
public class Test6 {
	public static void main(String[] args) {
		double money =1000000000;
		int day =0;
		for(double i =0 ;money>0;i++){
			day++;
			money=money/2;
		}
		System.out.println(day);
	}

}
