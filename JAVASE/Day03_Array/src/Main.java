import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int sum = input.nextInt();
//		�������������ֵ,��Ϊѭ���жϵ�����
		for(int i = 0; i<=sum;i++){
			//System.out.println(i+"+"+(sum-i)+"="+sum);
		}
		for(int i = 0,j=sum;i<=sum;i++,j--){
			//System.out.println(i+"*"+j+"="+sum);
		}
		for(int i=0; i<0;i++){
			//ѭ�����ճɼ�
			int score = input.nextInt();
			//��һ���ж��Ƿ�Ϊ����
			if(score<0){
				System.out.println("������˼,����");
				break;
				
			}	
		}
		int people = 0;
		for(int i = 0;i<10;i++){
			/*
			 * ѭ���ɼ�
			 * �������80��,���������people��
			 */
			int score = input.nextInt();
			if(score<80){
				System.out.println("�ɼ�̫��,������˼");
				continue;
			}
			people++;
		}
		System.out.println("��ʮ�����ϵ�����"+people);
	}

}
