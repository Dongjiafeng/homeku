import java.util.Scanner;

public class Homework2 {
	public static void main(String[] args) {
		int id = 827816736;
		int password =123456;
		String userName="����";
		Scanner input = new Scanner(System.in);
			System.out.println("�������˺�:");
			for(;;){
			int id1 = input.nextInt();
			
			if(id1==id){
				break;
				
			}else{
				System.out.println("�˺Ŵ���,�����������˺�:");
			     }
			}
			System.out.println("����������:");
			for(; ; ){
				int password1 = input.nextInt();	
				if(password1==password){
					break;
				}else{
					System.out.println("�������,��������������:");
				}
		}
		System.out.println("��ӭ"+userName+"����ϵͳ");
	}

}

