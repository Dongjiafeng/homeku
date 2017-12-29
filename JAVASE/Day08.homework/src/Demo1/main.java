package Demo1;

import java.util.Scanner;

public class main {
   public static void main(String[] args) {
	   Login login = new Login();
	   Scanner input = new Scanner(System.in);
	for(;login.userinter==null;){	
	System.out.println("请输出用户名:");
	String yo = input.nextLine();
	System.out.println("请输入密码:");
	String mi = input.nextLine();
	login.show(yo,mi);
	}	
	System.out.println("是否开始工作  1.是    2.否");
	int work = input.nextInt();
	switch(work){
	case 1:
		login.userinter.onLine();
		break;
	case 2:
		login.userinter.offLine();
		break;
		
	}
}
}
