import javax.print.attribute.standard.PrinterLocation;

public class Day02 {
 public static void main(String[] args){
//	 ����һ������,��ʾ���java�ɼ�
	 int javaScore = 
			 50;
	 if(javaScore>90){
		 System.out.println("�ɼ�����");
		 
	 }
	 if(javaScore>700){
		 System.out.println("������������,С�ֵ�.");
	 }else {
		System.out.println("������˼,��ȥ�ض�.");
	}
//	 ��Ҫִ�е����ֻ��һ��ʱ
//	 if��������Բ�д{}
	 if(javaScore<60)
		 System.out.println("��ͻؼ�����");
//	 ���ɼ�����80����С��100��ʱ��
//	 �����{}��ִ�����
//	 ͬʱ������ִ��
//	 &&:������ж�����������ʱ,�����ж��Ҳ�����
//	 &:������ж�����������ʱ,
//	 ��Ȼ���ж��Ҳ�����
	 if(javaScore>80 &&
			 javaScore<100){
		 System.out.println("ûë��,����");
		 
	 }
//	 ||��|
	 if(javaScore>60|| javaScore<90){
//		 ���ұ��ʽ,ֻ��һ��Ϊtrue
//		 ��ôif�жϵĽ������true
		 /*
		  * ||������Ϊtrue,�򲻻��ж��Ҳ�
		  * 
		  * |:���������ʲô,�����ж��Ҳ�.
		  */
	 }
	 if(!(javaScore<60)){
//		 !:�� !true = flase
//		    !false = true 
		 System.out.println("˵��>=60");
		 
	 }
//	 ��ν�������������ֵ?
	int a =10;
	int b =20;
//	��һ�ַ���
/*
 * ��һ�ַ���
 * 1.����һ���µı���c
 * 2.��a��ֵ��ֵ��c
 * 3.��b��ֵ��ֵ��a
 * 4.��c��ֵ��ֵ��b
 */
	int c = a;
	a=b;
	b=c;
	System.out.println("a:"+a);
	System.out.println("b:"+b);
/*
 * �ڶ��ַ���
 * �����ñ���,ֱ��ʹ�üӼ�������
 */
	a = a+b;
	b = a-b;
	a = a-b;
	/*
	 * �����ַ���
	 * ��ʹ�õ���������,ʹ�����^
	 * һ���������һ��������,������������
	 * 5^6^6 = 5
	 * |����2����
	 * ��һ����1,��������1
	 * ^������������
	 * ���߲����,��Ϊ1,�����Ϊ0
	 * Ҳ���ǲ�ͬʱΪ1��0
	 */
	System.out.println(26^23^23);
	a = a ^ b;
	b = a ^ b;
	a = a ^ b;
	if(javaScore>=60&&javaScore<=80){
		System.out.println("�е�");
	}else if(javaScore>=80){
		System.out.println("����");
	}else {
		System.out.println("��");
	}
	int speed = 15;
	
	int gender = 0;
	
	if(speed>10){
		System.out.println("������");
		if(gender==0){
			System.out.println("����������");
		}else if(gender==1){
			System.out.println("����Ů����");
		}else{
			System.out.println("����̫����,pass");
		}
	}
 }
}
