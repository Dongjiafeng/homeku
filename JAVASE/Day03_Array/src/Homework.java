
public class Homework {
public static void main(String[] args) {
	for(int i=0 ; i<10;i++){
			for(int j = 0; j<20;j++){
				
				System.out.print("*");
			}
			System.out.println();
	}
	
	//Ë®ÏÉ»¨
	
	int a =0;
	int b =0;
	int c =0;
	for(int i =100;i<=999;i++){
		a=i/100;
		b=(i/10)-(a*10);
		c=i-(a*100)-(b*10);
		if((a*a*a)+(b*b*b)+(c*c*c)==i){
			System.out.println(a+"^3+"+b+"^3+"+c+"^3"+"="+i);
		}
	}
}
}
