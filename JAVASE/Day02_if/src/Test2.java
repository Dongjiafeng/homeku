
public class Test2 {
	public static void main(String[] args){
		System.out.println("189Ԫ��:");
		int money = 189;
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		int a4 = 0;
		int a5 = 0;
		int a6 = 0;
		for(int i=0;money>=100;i++){
			money = money - 100;
			a1++;
		}
		for(int i=0;money>=50;i++){
			money =money -50;
			a2++;
		}
		for(int i=0;money>=20;i++){
			money =money -20;
			a3++;
		}
		for(int i=0;money>=10;i++){
			money =money -10;
			a4++;
		}
		for(int i=0;money>=5;i++){
			money =money -5;
			a5++;
		}
		for(int i=0;money>=1;i++){
			money =money -1;
			a6++;
		}
		System.out.println("100����"+a1+"��");
		System.out.println("50����"+a2+"��");
		System.out.println("20����"+a3+"��");
		System.out.println("10����"+a4+"��");
		System.out.println("5����"+a5+"��");
		System.out.println("1����"+a6+"��");
		
	}
	

}
