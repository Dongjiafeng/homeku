import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;
import javax.security.auth.kerberos.KerberosKey;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Main2 {
	public static void main(String[] args){
	//	System.out.println("1");
/*
 * while ѭ��
 * ���ж������е�����,�Ƿ�Ϊtrue
 * ���Ϊture��ִ��
 * ���������������,Ȼ��
 * ���ж�������������Ƿ�Ϊtrue,
 * ���.... һ���
 *   ����������Ϊfalseʱ
 *   whileѭ��ֹͣ
 */
		int i = 51;
		
		
		while(i<50 );
		{
			//�������е����ݽ���ѭ����
//			С���ŵ����ݽ���ѭ������
			System.out.println(i);
			//ѭ������
			//Ϊ������ѭ��,��ֹ������ѭ��
			//i = i+1;
			//i++;
//			++i;
//			i = i*7;
			i*=7;
			
		}
		int progress = 1;
		do{
			progress+=2;
			System.out.println(progress);
		}while(progress<10);
		/*
		 * do-while �� while������
		 * do-while ����ִ��һ��ѭ����,Ȼ�����ж�
		 * while�����ж�Ȼ����ִ�е�ѭ����
		 */
		
		int b = 1000;
		while(b<100){
			System.out.println("�ú�ѧϰ��������");
			b++;
		}
	/*
	 * int o = 0;���ó�ʼ����
	 * k<100;ѭ������
	 * k++;ѭ������
	 * {}�е�����:ѭ�� ��
	 */
		for(int o = 1000;o<100;o++){
			System.out.println("�󼪴���,���ϳԼ�!");
		}
		//����������һ����
//		while(true){
//			
//		}
//		for(;;){
//			
//		}
		int f = 0;
		for(;f<10;f++){
			
		}
		for(;f<10;f+=5){
			
		}
		//�̶���ʽ,����һ������
		Scanner input = new Scanner(System.in);
		//������仰,��õ�����̨���������
		//���ǽ���һ������ȥ���յõ�������
		//String c = input.nextLine();
	//	System.out.println("���ǵõ���c:"+c);
		/*
		 * import
		 * Scanner
		 * Console
		 */
		System.out.println("���������ſγɼ�:");
//		����һ���������洢
		int sum = 0;
		
	
	for(int g=1;g<6;g++){
		
		//String t = input.nextLine();
		System.out.println("��"+g+"��:");
		int k = input.nextInt();
		sum+=k;
		System.out.println("��"+g+"��"+"�ĳɼ�Ϊ:"+k);
	}
	int pingjun = sum/5;
	System.out.println("���ŵ�ƽ��ֵ��:"+pingjun);
 }
}
