package demo;

import java.util.Scanner;

public class main {
  
	public static void main(String[] args) {
		Login login = new Login();
		UserInter o;
		Scanner input = new Scanner(System.in);
		for(;;){System.out.println("请输入用户名:");
		String yo = input.nextLine();
		System.out.println("请输入密码:");
		String mi = input.nextLine();
		
		 o =login.show(yo, mi);
		 if(o!=null){
			 break;
		 }
		}
		System.out.println("是否工作:  1. 是     2.否");
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
