
public class Test4 {
public static void main(String[] args) {
	int kilo = 65;
	if(kilo<=50){
		 
		double price = kilo * 0.15;
		System.out.println(price);
		
	}else{
		double price = 50*0.15 +(kilo-50)*0.25;
		System.out.println(price);
	}
}
}
