package com.lanou3g.study;

public class Animal {
	/*
	 * ʲô�Ǽ̳�?
	 * java��������̵���������֮һ
	 * ��װ,��̬,�̳�
	 * A�� �̳��� B��
	 * B�� �Ǹ���
	 * A�� ������
	 * ������Լ̳и�������Ժͷ���
	 * ����һ����Pig,ʹ��extends�ؼ���
	 *       �̳�Animal �����
	 *       
	 */
	//��ʾ����	
	private String kind;
//	public Animal(){
//		
//		System.out.println("--------��������---------");
//	}
	public Animal(String kind){
		this.kind = kind;
				System.out.println("�����������Ϊ:"+kind);
	}
	
	
	
	
	public void sleep(){
		System.out.println("˯һ��");
		
	}
	

}
