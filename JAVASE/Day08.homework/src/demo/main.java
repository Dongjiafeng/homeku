package demo;

import java.util.Scanner;

public class main {
  
	public static void main(String[] args) {
		Login login = new Login();
		UserInter o;
		Scanner input = new Scanner(System.in);
		for(;;){System.out.println("�������û���:");
		String yo = input.nextLine();
		System.out.println("����������:");
		String mi = input.nextLine();
		
		 o =login.show(yo, mi);
		 if(o!=null){
			 break;
		 }
		}
		System.out.println("�Ƿ���:  1. ��     2.��");
		int work = input.nextInt();
		switch(work){
		case 1:
			o.onLine();
			break;
		case 2:
		    o.offLine();
		    break;
		}
	}
}
