package demo;

import java.util.Arrays;

public class Dome {
	//��ά����ʾ�� {
		public static void main(String[] args) {

	//����һά���飬�����װ����������װ���ַ���
			
	//��ά�������˼����
			
	//��ÿһ��Ԫ�ص�λ�ã���װ��һ������
			
	//��������Ϊ��һ�������ӣ�������������һЩС����
			
	//��ά���������������ӣ�����ÿ�����ӣ�����
			
	//�����һ����һά����
			
			
	//һά������һ��������
			
	//��ά�����������������
			
	//����new String[x][y]
			
	//x�ͱ�ʾ�����ά����ĳ����Ƕ���
			
	//y�ͱ�ʾ��ά�����У���һ��Ԫ�صĳ����Ƕ���
			
			
	String[] users[] = new String[4][6];
			
	System.out.println("��ά����ĳ��ȣ�"+users.length);
			
	//�������ȡ��ά�����е�0��λ�õ�һά����ĳ���
			
	System.out.println("��ά�����е�һά����ĳ��ȣ�"+users[0].length);
			
	//����ֵ
			
	for(int i=0;i<users.length;i++){
				
	//i������ʾ��ά�����Ԫ�صĽǱ�
				
	//users.length�Ƕ�ά����ĳ���
				
	//Ҳ����4	
				
	for(int j=0;j<users[i].length;j++){
					
	//j������ʾ��ά�����е�i��Ԫ��(�Ǹ�һά����)�е�Ԫ�صĽǱ�
					
	users[i][j] = " "+i+j;
				
	}
			
	}
	users[2][3] = "Ŷ"	;	
			
	//�������
			
	//���������ÿ��Ԫ�ص�ֵ���������Ԫ�صĶ�ά�Ǳ�
			
	//��������ѧ��ʱ��ѧ��xy����ϵ����xy����ֵ���Զ�λһ����
			
	showTwoArray(users);
			
		}
		
		
	public static void showTwoArray(String[][] twoArr){
			
	for(int i=0;i<twoArr.length;i++){
				
	System.out.println(Arrays.toString(twoArr[i]));
			
	}	

	
}
}