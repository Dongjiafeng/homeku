package com.lanou3g.main;

public class Stringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
	 * String ��
	 * ��ʾ�ַ���
	 * ע��.�ַ������ǻ�����������
	 */
		//�ַ����ǲ��ɱ��.��һ���ַ�����������
		//�������ڷ����仯
		String s1 = "����";
		String s2 = "����";
		String s3 = new String("����");
		String s4 = new String("����");		
		
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		//equlas���ַ����ķ���
		//��Ҫ���ַ���,������ʹ���������
		//����:�ж������ַ����������Ƿ����
		boolean bo = s3.equals(s4);
		System.out.println(bo);
		
		
		
	}

}
