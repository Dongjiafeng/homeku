
import java.util.Arrays;
import java.util.Scanner;

import javax.print.attribute.standard.PrinterLocation;

public class Main3 {
		public static void main(String[] args) {
			int[] scores = {98,99,94,56,87};
			/*
			 * scores���Ǳ�ʶ�� ,��������������
			 * int ��ʾ��������п���װ�ڵ�������
			 * int[]��ʾ�����������
			 * 
			 * {}�е�����,�������������
			 * 98:�����е�Ԫ��,���������е�����
			 * �±�:
			 * Ԫ���������е�λ��,��0��ʼ����.
			 * ���������һ��Ԫ�ص��±�:
			 *  		����ĳ���-1
			 */
			//ȡ�������е��±�0��Ԫ��
			//��ֵ��һ������b
			int b =scores[0];
			System.out.println(b);
			//��������ĵڶ��ַ�ʽ
			//����Ӳ��
			int[] d = new int [3];
//			d.length:��ʾ����d�ĳ���
			Scanner input = new Scanner(System.in); 
			for(int i = 0;i<d.length;i++){
				//���������������ֵ
				//��ֵ��r
//				int performance = input.nextInt();
//				��r��ֵ��ֵ�������еĵ�iλ�õ�Ԫ��
//				d[i]=performance;
				System.out.println("��¼���"+(i+1)+"���ɼ�:");
				d[i]=input.nextInt();
			}
			//�̶�д��,����ֱ�����d������
			System.out.println(Arrays.toString(d));
			d[4]=100;
		} 
}
